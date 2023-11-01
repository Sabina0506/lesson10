import java.util.Scanner;
import java.util.regex.Pattern;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {


        Scanner scanner=new Scanner(System.in);

        System.out.print("Enter Full name:");
        String name= scanner.nextLine();

        System.out.print("Enter Gmail:");
        String email= scanner.nextLine();

        System.out.print("Enter Phone number:");
        String phonenumber= scanner.nextLine();

        System.out.print("Enter password:");
        String password= scanner.nextLine();


        User user=new User(name,email,phonenumber,password);

        boolean namematches = Pattern.matches("[A-Z]{1}[a-z]+\s[A-Z]{1}[a-z]+\s*[A-Z]?[a-z]*", user.Fullname);
        System.out.println(namematches);
        boolean Gmailmatches = Pattern.matches("[A-Z]*[a-z]*(@gmail.com)", user.Email);
        System.out.println(Gmailmatches);
        boolean numbermatches = Pattern.matches("\\+998[0-9]{9}", user.PhoneNumber);
        System.out.println(numbermatches);
        boolean passwordmatches = Pattern.matches("[[A-Z]+[a-z]+[0-9]+\\W+]{8,}", user.Password);
        System.out.println(passwordmatches);


        if (namematches&&Gmailmatches&&numbermatches&&passwordmatches)
        {
            System.out.println(user);
        }


    }
}