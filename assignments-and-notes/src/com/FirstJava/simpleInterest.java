package com.FirstJava;

import java.util.Scanner;

public class simpleInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the principal amount:");
        int p = input.nextInt();
        System.out.println("Enter the time taken (in years):");
        int t = input.nextInt();
        System.out.println("Enter the rate of interest:");
        int r = input.nextInt();
        System.out.println("The simple interest for the given value is: ₹" + (p * t * r)/100);
    }
}
