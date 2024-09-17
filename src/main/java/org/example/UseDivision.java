package org.example;
import java.util.Scanner;

public class UseDivision {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            Division division;  // Division reference
            String divisionName;
            int accountNumber;

            // Prompt user for the division type
            System.out.print("Enter 1 for Domestic Division or 2 for International Division: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            // Common inputs for both types
            System.out.print("Enter the division name: ");
            divisionName = scanner.nextLine();

            System.out.print("Enter the account number: ");
            accountNumber = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            if (choice == 1) {
                // Create DomesticDivision
                System.out.print("Enter the state: ");
                String state = scanner.nextLine();
                division = new DomesticDivision(divisionName, accountNumber, state);
            } else if (choice == 2) {
                // Create InternationalDivision
                System.out.print("Enter the country: ");
                String country = scanner.nextLine();

                System.out.print("Enter the language spoken: ");
                String language = scanner.nextLine();

                division = new InternationalDivision(divisionName, accountNumber, country, language);
            } else {
                // Invalid choice, exit the program
                System.out.println("Invalid choice.");
                scanner.close();
                return;
            }

            // Display the details of the created object
            System.out.println("\nDivision Details:");
            division.display();

            scanner.close();
        }
    }


