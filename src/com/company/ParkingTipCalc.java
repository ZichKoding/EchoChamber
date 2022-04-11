package com.company;

import java.util.Scanner;

public class ParkingTipCalc {
    public static void main(String[] args) {
        var parkingPrice = new Scanner(System.in);
        double tip;

        System.out.println("What is the parking price?");
        // receive only a double from user input aka Scanner
        tip = parkingPrice.nextDouble();
        // to get the tip multiply by 20%
        tip = tip * .2;

        System.out.println("You should tip the parking attendant $" +tip + ".");

        parkingPrice.close();

    }
}
