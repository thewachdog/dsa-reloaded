package com.ConditionsAndLoops.Easy;

import static java.lang.Math.pow;

public class EquilateralTriangle {
    public static void main(String[] args) {
        /*

        Area = 1/2 × base × height

        side is given: Area = √3(a^2)/4

         */

        int side = 4;
        System.out.println( (pow(3, 0.5) * pow(side, 2))/4 );
        System.out.println("Perimeter :" + 3 * side);
    }
}
