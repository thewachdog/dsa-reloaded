package com.FirstJava;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int curr = 1, prev = 0;
        while (n > 0){
            System.out.println(prev);
            int temp = prev;
            prev = curr;
            curr += temp;
            n--;
        }
    }
}
