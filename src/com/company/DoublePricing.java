package com.company;

import java.util.Scanner;

public class DoublePricing {
    public static void main(String[] args) {
        // drivePrice is to listen to the inputs from the keyboard through System.
        var drivePrice = new Scanner(System.in);
        double amount;

        System.out.println("What is the price of the flashdrive?");
        // capture the double amount of the user
        amount = drivePrice.nextDouble();
        // now double that price and add shipping
        amount = (amount * 2) + 25.00;

        // now print back the total.
        System.out.println("You will be charged $" + amount + " to your credit card.");

        drivePrice.close();
    }
}
