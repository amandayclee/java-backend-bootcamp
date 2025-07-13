package io.javabrains.javabasics;

public class PrimitiveAndWrapperClasses {
    public static void main(String[] args) {
        // Step 1: Declare primitive variables
        int v1 = 10;

        // Step 2: Convert primitive variables to wrapper objects
        Integer integerWrapper = v1;
        // Auto boxing

        // Step 3: Print the values of the wrapper objects
        System.out.println("integerWrapper = " + integerWrapper);

        // Step 4: Convert wrapper objects back to primitive variables
        v1 = integerWrapper;

        // Step 5: Print the values of the primitive variables
        System.out.println("v1 = " + v1);

    }
}
