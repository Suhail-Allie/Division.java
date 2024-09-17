package org.example;

    public class InternationalDivision extends Division {
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

