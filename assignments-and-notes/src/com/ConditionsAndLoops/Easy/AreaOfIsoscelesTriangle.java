package com.ConditionsAndLoops.Easy;

public class AreaOfIsoscelesTriangle {
    public static void main(String[] args) {
        /*

        Isosceles Right Triangle Area= ½ × a2


        Isosceles Triangle Using Only Sides = ½[√(a2 − b2 /4) × b]
            b = base of the isosceles triangle
            h = height of the isosceles triangle =  √(a2 − b2/4)
            a = length of the two equal sides

         */

        int base = 12, height = 17;
        System.out.println(0.5 * base * height);
    }
}
