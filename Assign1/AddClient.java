import java.rmi.*;
import java.util.Scanner;

public class AddClient {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create a Scanner object to read user input
        try {
            // Define the RMI server's URL
            String serverURL = "rmi://localhost/AddServer";

            // Look up the remote object AddServerIntf using the specified server URL
            AddServerIntf addServerIntf = (AddServerIntf) Naming.lookup(serverURL);

            // Prompt the user to enter the first number
            System.out.print("Enter no 1:");
            double d1 = sc.nextDouble(); // Read the first number from the user input

            // Prompt the user to enter the second number
            System.out.print("Enter no 2:");
            double d2 = sc.nextDouble(); // Read the second number from the user input

            // Print the first number entered by the user
            System.out.println("no 1:" + d1);

            // Print the second number entered by the user
            System.out.println("no 1:" + d2);

            // Display a header for the results
            System.out.println("-------Results---------");

            // Calculate the addition of the two numbers using the remote method 'add'
            // provided by the server
            System.out.println("Addition is:" + addServerIntf.add(d1, d2)); // Display the result of addition

        } catch (Exception e) {
            // Catch any exceptions that may occur during the execution of the program and
            // print the error message
            System.out.println("Exception occured at client" + e.getMessage());
        }
    }
}
