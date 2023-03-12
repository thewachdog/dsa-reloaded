package com.ConditionsAndLoops;

public class SwitchStatement {
    public static void main(String[] args) {
        String fruit = "Apple";

        switch (fruit) {
            case "Apple" -> System.out.println("Red fruit");
            case "Mango" -> System.out.println("Yellow fruit");
            case "Grapes" -> System.out.println("small fruit");
            case "Orange" -> System.out.println("Round fruit");
            default -> System.out.println("Not in list");
        }

//        switch (fruit){
//            case "Apple":
//                System.out.println("Red fruit");
//                break;
//            case "Mango":
//                System.out.println("Yellow fruit");
//                break;
//            case "Grapes":
//                System.out.println("small fruit");
//                break;
//            case "Orange":
//                System.out.println("Round fruit");
//                break;
//            default:
//                System.out.println("Not in list");
//        }

        int day = 3;
        switch (day){
            case 1, 2, 3, 4, 5:{
                System.out.println("Weekday");
            }
            case 6, 7:
                System.out.println("Weekend");
        }
    }
}
