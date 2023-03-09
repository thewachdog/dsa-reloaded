package com.FirstJava;

import java.util.Scanner;

import static java.lang.Math.pow;

public class Armstrong {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int fin = 0, copy = num;
        while (num > 0) {
            fin += pow(num % 10, 3);
            num /= 10;
        }
        if(fin == copy)
            System.out.println("It is armstrong number");
        else
            System.out.println("It is not armstrong number");
    }
}
