package com.company;

/*
HIRING A PLUMBER CHALLENGE
A local plumber charges $75 to come to my house. In addition, for every hour the plumber works at my house, the plumber
charges an additional $125. Write a program that inputs the number of hours that a plumber works at my house and outputs
the total amount that the plumber charges.
*/
import java.util.Scanner;

public class HiringAPlumber {
    public static void main(String[] args) {
        // used the var keyword to let Java decide the type since we are initiating the value at the same time.
        var keyboard = new Scanner(System.in);
        // declaring the hours and totalCharge variable to be an integer
        int hours, totalCharge;
        // declaring and initiating plumberWage as integer 125 and visitCharge as integer 75
        int plumberWage = 125;
        int visitCharge = 75;

        // Ask question to prompt user for input
        System.out.print("How many hours did the plumber work? ");
        // capture the next integer the user inputs
        hours = keyboard.nextInt();

        // multiply the plumberWage to hours and then add the visitCharge
        totalCharge = plumberWage * hours + visitCharge;

        System.out.println("");
        System.out.println("The plumber worked a total of " + hours + " hours.");
        System.out.println("This brings the total cost to $" + totalCharge + ".");
    }
}
