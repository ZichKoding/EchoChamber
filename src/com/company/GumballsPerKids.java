package com.company;

import java.util.Scanner;

public class GumballsPerKids {
    public static void main(String[] args) {
        // declare and initialize variable name keyboard with Scanner
        var keyboard = new Scanner(System.in);
        // declare variables
        int gumballs, kids, gumballsPerKid;
//        int gumballs;
//        int kids;
//        int gumballsPerKid;

        // question for the user
        System.out.print("How many gumballs? How many Kids?");
        // catch the first input as the amount of gumballs
        gumballs = keyboard.nextInt();
        // catch the next input as the amount of kids
        kids = keyboard.nextInt();
        // Divide the gumballs by the kids for how much each kid should get
        gumballsPerKid = gumballs / kids;

        // Print out the result to the console
        System.out.print("Each kid gets ");
        System.out.print(gumballsPerKid);
        System.out.println(" gumballs.");

        keyboard.close();
    }
}
