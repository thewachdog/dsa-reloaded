
package com.ConditionsAndLoops;

public class ReverseNumber {
    public static void main(String[] args) {
        int num = 9322731;
        int fin = 0;
        while(num > 0){
            fin = fin * 10 + num%10;
            num /= 10;
        }
        System.out.println(fin);
    }
}
