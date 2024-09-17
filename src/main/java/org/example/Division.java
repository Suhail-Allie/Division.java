package org.example;

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


