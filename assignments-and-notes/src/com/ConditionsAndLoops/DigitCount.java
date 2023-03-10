package com.ConditionsAndLoops;

import java.util.Scanner;

public class DigitCount {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        /*
        approaches:
        - convert to string and iterate
        - use % and /
         */

        int n = 1039073790, find = 7, count = 0;
        while (n > 0){
            if(n%10 == find){
                count += 1;
            }
            n /= 10;
        }
        System.out.println(count);
    }
}
