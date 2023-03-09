package com.FirstJava;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.next();
        boolean val = true;
        for(int i = 0; i < s.length() / 2; i++){
            if(s.charAt(i) != s.charAt(s.length() - i - 1)){
                System.out.println("Not a palindrome");
                val = false;
                break;
            }
        }
        if(val){
            System.out.println("It is palindrome");
        }
    }
}
