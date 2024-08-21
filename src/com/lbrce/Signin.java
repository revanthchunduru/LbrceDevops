import java.util.Scanner;

public class SignInSystem {

    // Hard-coded credentials for demonstration purposes
    private static final String USERNAME = "user";
    private static final String PASSWORD = "password";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt for username
        System.out.print("Enter username: ");
        String inputUsername = scanner.nextLine();

        // Prompt for password
        System.out.print("Enter password: ");
        String inputPassword = scanner.nextLine();

        // Validate credentials
        if (validateCredentials(inputUsername, inputPassword)) {
            System.out.println("Sign-in successful!");
        } else {
            System.out.println("Invalid username or password.");
        }

        // Close the scanner
        scanner.close();
    }

    // Method to validate credentials
    private static boolean validateCredentials(String username, String password) {
        return USERNAME.equals(username) && PASSWORD.equals(password);
    }
}

