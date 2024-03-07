package Smells;

import java.util.*;

public class Smell {

    // God Class and Large Class Violation
    // Excessive number of methods and lines
    // Method with too many parameters (Data Clump)
    public ViolationClass(int a, int b, int c, int d, int e, int f) {
        // Constructor with too many parameters
    }

    // Primitive Obsession and Method with too many parameters
    public void methodWithPrimitives(int a, int b, int c, int d) {
        // Method with too many primitive parameters
    }

    // Method with too many parameters
    public void methodWithManyParameters(int a, int b, int c, int d) {
        // Method with too many parameters
    }

    // Long Method Violation
    public void longMethod() {
        // Excessive length
        int i = 0;
        while (i < 1000) {
            i++;
        }
        
    }

    // Empty Try Block
    public void emptyTryBlock() {
        try {
            // Empty try block
        } catch (Exception e) {
            // Empty catch block
        }
    }

    // Method Chaining
    public void methodChaining() {
        String result = "Violation".substring(1).toUpperCase().replace("I", "1").trim();
    }

    // Swallowed exception
    public void swallowedException() {
        try {
            int[] arr = new int[5];
            arr[5] = 10;
        } catch (Exception e) {
            // Exception is swallowed
        }
    }

    // Unused private method (Dead Method)
    private void unusedMethod() {
        // Method never called
    }

    // Lacks Javadoc comment
    public void publicMethodWithoutComment() {
        // Method without Javadoc
    }
}
