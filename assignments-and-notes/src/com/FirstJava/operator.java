package com.FirstJava;

import java.util.Scanner;

public class operator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two numbers:");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        System.out.println("Enter an operator to calculate value:");
        char op = input.next().charAt(0);
        System.out.println(op);
        System.out.println("The value of two numbers is:");
        if(op == '+')
            System.out.println(num1 + num2);
        else if(op == '-')
            System.out.println(num1 - num2);
        else if (op == '*') {
            System.out.println(num1 * num2);
        } else if (op == '/') {
            System.out.println(num1 / num2);
        }
    }
}
