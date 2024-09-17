package org.example;

    public class DomesticDivision extends Division {
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

