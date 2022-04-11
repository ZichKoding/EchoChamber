package com.company;

import java.util.Scanner;

public class EchoKeyData {
    public static void main(String[] args) {
        // the variable type is Scanner and variable name is keyData
        Scanner keyData = new Scanner(System.in);
        // vairable type is double and variable name is amount
        double amount;

        System.out.println("What's the price of the flashdrive?");
        // set amount to equal the next double type data from keyboard. ***Note*** THIS HAS TO BE A NUMBER INPUT ONLY
        amount = keyData.nextDouble();
        // add shipping and handling of 25 bucks to amount
        amount = amount + 25.00;

        // Print out the charging statement
        System.out.print("We will bill $");
        System.out.print(amount);
        System.out.println(" to your credit card.");

        keyData.close();
    }
}
