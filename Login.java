import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Login {
    public static void main(String[] args) throws IOException {

        // .next() on scanner objects SPLITS BY WHITE SPACE

        File myObj = new File("users.txt");
        Scanner myReader = new Scanner(myObj);
        Scanner userInput = new Scanner(System.in);

        System.out.println("Enter username");
        String userName = userInput.nextLine();

        System.out.println("Enter password");
        String password = userInput.nextLine();

        String potentialUser = userName + " " + password;
        System.out.println(potentialUser);

        while (myReader.hasNextLine()) {
            System.out.println("***");
            String data = myReader.nextLine();
            System.out.println(data);
            System.out.println(potentialUser);

            if (data.equals(potentialUser)) {
                System.out.println("WELCOME");
                break;
            }
            System.out.println("???");
        }

        myReader.close();
        userInput.close();
    }
}
