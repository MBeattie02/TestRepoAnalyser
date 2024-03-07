// Incorrectly ordered imports
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;

public class style {
    // Constant not in uppercase
    public final int max_count = 10;

    // Method name starting with uppercase
    public void CheckStyle() {

        int threshold = 5;
        // Incorrect brace style
        if (threshold < max_count) 
        {
            System.out.println("Threshold is less than max");
        }
        // Variable not following camelCase
        int UserAge = 25;
        // Incorrectly named variable (should be in camelCase)
        int incorrect_variable_name = 30;
        // More magic numbers
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
    }

    public void anotherMethod() {
            System.out.println("Incorrect indentation here."); // Incorrectly indented
        System.out.println("Correct indentation."); // Correctly indented
    }

    // Incorrectly named interface
    interface badInterfaceName {
        void doSomething();
    }
}
