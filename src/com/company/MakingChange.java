package com.company;

import java.util.Scanner;

public class MakingChange {
    public static void main(String[] args) {
        // variable for initiating keyboard... var only works like this because it is being initiated by the
        // instance of the object Scanner.
        var keyboard = new Scanner(System.in);
        // declaring that quarters, dimes, nickels, cents are intended to be integers
        int quarters, dimes, nickels, cents;
        // declaring whatsLeft and total are intended to be integers
        int whatsLeft, total;

        // Prompts user in the console with how many cents do they have.
        System.out.print("How many cents do you have? ");
        // When the user enters an integer the variable that was declared earlier stores that variable from user input.
        total = keyboard.nextInt();

        // The first step is to break it down into how many quarters there should be
        quarters = total / 25;
        // then taking the remainder (% = modulus) of the quarters and storing that integer in whatsLeft
        whatsLeft = total % 25;

        // The second step is divide by 10 for the dimes
        dimes = whatsLeft / 10;
        // then find the remainder of whatsLeft by using the modulus (%) by 10 and storing the new value into whatsLeft
        whatsLeft = whatsLeft % 10;

        // The third step is to divide by 5 for the nickels
        nickels = whatsLeft / 5;
        // then find the remainder of whatsLeft by using the modulus (%) by 5 and storing the new value into whatsLeft
        whatsLeft = whatsLeft % 5;

        // Last step is to store the whatsLeft into cents (pennies) for the smallest coin.
        cents = whatsLeft;

        System.out.println();
        System.out.println("From " + total + " cents you get");
        System.out.println(quarters + " quarters");
        System.out.println(dimes + " dimes");
        System.out.println(nickels + " nickels");
        System.out.println(cents + " pennies");

        keyboard.close();
    }
}
