package Quality;

import java.util.List;

public class Quality {

    // Duplicate method issue: Only one of these method2() should be present
    public void method2() {
        int product = 1;
        for (int i = 1; i <= 5; i++) {
            product *= i;
        }
        System.out.println("Product: " + product);
    }

    // Duplicate of the above method
    public void method2() {
        int product = 1;
        for (int i = 1; i <= 5; i++) {
            product *= i;
        }
        System.out.println("Product: " + product);
    }


    // Refactor suggestion: Convert loops to stream operations
    public List<String> convertToUpperCase(List<String> strings) {
        List<String> upperCaseStrings = new ArrayList<>();
        for (String str : strings) {
            upperCaseStrings.add(str.toUpperCase());
        }
        return upperCaseStrings;
    }

    private void processNumber(Integer number) {
        // Some processing on the number
    }

    private void handleSmallNumber(Integer number) {
        // Handle numbers <= 10
    }
}
