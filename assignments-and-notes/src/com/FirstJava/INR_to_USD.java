package com.FirstJava;

import java.util.Scanner;

public class INR_to_USD {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter amount in INR:");
        int num = input.nextInt();
        System.out.println("The corresponding amount in USD is:" + 0.012 * num); // as of 07/03/2023
    }
}
