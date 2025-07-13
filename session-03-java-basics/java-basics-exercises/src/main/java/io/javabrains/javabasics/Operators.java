package io.javabrains.javabasics;

import java.util.ArrayList;
import java.util.List;

public class Operators {
    public static void main(String[] args) {
        // Step 1: Declare variables
        Integer a = 10;
        Integer b = 20;

        // Step 2: Perform arithmetic operations
        Integer plus = a + b;
        Integer subtract = a - b;
        Integer multiply = a * b;
        Integer divide = a / b;
        Integer module = a % b;


        // Step 3: Print the results of the arithmetic operations
        System.out.println("plus = " + plus);
        System.out.println("subtract = " + subtract);
        System.out.println("multiply = " + multiply);
        System.out.println("divide = " + divide);
        System.out.println("module = " + module);


        // Step 4: Perform increment and decrement operations
        plus++;
        subtract--;


        // Step 5: Print the results of the increment and decrement operations
        System.out.println("plus = " + plus);
        System.out.println("subtract = " + subtract);


        // Step 6: Perform comparison operations
        boolean isTrue = a != b;
        boolean isFalse = a == b;


        // Step 7: Print the results of the comparison operations
        System.out.println("isTrue = " + isTrue);
        System.out.println("isFalse = " + isFalse);

        // Step 8: Perform logical operations
        boolean isNotTrue = (a > b) && (a == a);
        boolean isNotFalse = (a != b) || (a < b);

        // Step 9: Print the results of the logical operations
        System.out.println("isNotTrue = " + isNotTrue);
        System.out.println("isNotFalse = " + isNotFalse);


    }
}
