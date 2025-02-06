/*author : priscilla gacheru 
  reg: BSE-01-0051/2024
  description: program for login in
  */
import java.io.Console;
import java.util.Scanner;

public class LoginSystem {
    public static void main(String[] args) {
        // Preset username and password
        final String USERNAME = "admin";
        final String PASSWORD = "password123";
Scanner scanner = new Scanner(System.in);
        Console console = System.console(); // For password masking

        int attempts = 3; // Number of login attempts allowed

        while (attempts > 0) {
System.out.print("Enter username: ");
            String inputUsername = scanner.nextLine(); // Read username input

            String inputPassword;
// Read password with masking if Console is available
            if (console!= null) {
                char[] passwordArray = console.readPassword("Enter password: ");
inputPassword = new String(passwordArray);
            } else {
                // If running in an IDE that doesn't support Console, fallback to Scanner
System.out.print("Enter password: ");
                inputPassword = scanner.nextLine();
            }
// Verify the credentials (username, password)
            if(inputUsername.equals(USERNAME) && inputPassword.equals(PASSWORD)){
               System.out.println("Login Succesfully!  welcome  "+USERNAME);
return; // Exit the program when login is successful
            } else {
                attempts--; // Decrease attempts on failure
System.out.println("Incorrect username or password. Attempts left: " + attempts);
            }
        }

        // If all attempts are used up, deny access
System.out.println("Too many failed attempts. Access denied.");
        scanner.close();
    }
