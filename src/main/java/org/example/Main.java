package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
  //Division
    public abstract class Division {
        protected String divisionName;  // Company's division name
        protected int accountNumber;    // Division's account number

        // Constructor that requires values for both fields
        public Division(String divisionName, int accountNumber) {
            this.divisionName = divisionName;
            this.accountNumber = accountNumber;
        }

        // Abstract method to display division details
        public abstract void display();
    }

    //DomesticDivision
    public class DomesticDivision extends org.example.Division {
        private String state; // State where the division is located

        // Constructor requires division name, account number, and state
        public DomesticDivision(String divisionName, int accountNumber, String state) {
            super(divisionName, accountNumber);
            this.state = state;
        }

        // Override the abstract display method
        @Override
        public void display() {
            System.out.println("Domestic Division: " + divisionName);
            System.out.println("Account Number: " + accountNumber);
            System.out.println("State: " + state);
        }
    }

    //InternationalDivision
    public class InternationalDivision extends org.example.Division {
        private String country;  // Country where the division is located
        private String language; // Language spoken in the division

        // Constructor requires division name, account number, country, and language
        public InternationalDivision(String divisionName, int accountNumber, String country, String language) {
            super(divisionName, accountNumber);
            this.country = country;
            this.language = language;
        }

        // Override the abstract display method
        @Override
        public void display() {
            System.out.println("International Division: " + divisionName);
            System.out.println("Account Number: " + accountNumber);
            System.out.println("Country: " + country);
            System.out.println("Language: " + language);
        }
    }

    //UseDivision
    public class UseDivision {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            org.example.Division division;  // Division reference
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
                division = new org.example.DomesticDivision(divisionName, accountNumber, state);
            } else if (choice == 2) {
                // Create InternationalDivision
                System.out.print("Enter the country: ");
                String country = scanner.nextLine();

                System.out.print("Enter the language spoken: ");
                String language = scanner.nextLine();

                division = new org.example.InternationalDivision(divisionName, accountNumber, country, language);
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



}