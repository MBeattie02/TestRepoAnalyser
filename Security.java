package Security;

import java.util.Date;

//Hardcoded Passwords

public class Security {
    private String userPassword = "password123";
    
    public void connectToDatabase() {
        String connectionToken = "secretToken";
        String dbConnection = "jdbc:database://localhost:3306/users?user=admin&password=" + userPassword;
        // ...
    }
    
    public void someMethod() {
        sendRequest("https://api.example.com/login", "apiKey=secretApiKey");
        // ...
    }

  //Insecure Algorithm
    
    public void insecureEncryptionMethod() {
        String algorithm = "DES"; // Weak algorithm
        byte[] keyBytes = new byte[]{0x01, 0x23, 0x45, 0x67, (byte) 0x89, (byte) 0xab, (byte) 0xcd, (byte) 0xef};
        Key key = new SecretKeySpec(keyBytes, algorithm);
        Cipher cipher = Cipher.getInstance(algorithm);
        // ... encryption operations ...
    }

  //Depricated API

  public void checkDate() {
        Date date = new Date();
        int year = date.getYear();  // Deprecated method usage
        System.out.println("Year: " + year);
    }

  public Object deserialize(byte[] data) throws Exception {
        try (ObjectInputStream ois = new ObjectInputStream(new ByteArrayInputStream(data))) {
            // This line could potentially lead to insecure deserialization
            return ois.readObject();
        }
  }

    //Insecure Key

    // This looks like a hard-coded API key, which is often a high-entropy string
    private static final String API_KEY = "aPv4H35JmI0kvP77GG8Df4rt67Yk9w";

    public void accessService() {
        // Some method that uses the API_KEY to access a service
        String serviceUrl = "https://api.example.com/access?key=" + API_KEY;
        // ... code to access the service ...
    }

    //race Condition

     // Shared static resource
    private static int sharedCounter;

    public void increment() {
        // Directly modifying the shared resource without synchronization
        sharedCounter++;
    }

    public static synchronized void safeIncrement() {
        // Synchronized method to modify the shared resource
        sharedCounter++;
    }

    public void methodUsingSharedResource() {
        // Another method accessing shared resource without synchronization
        System.out.println("Counter value: " + sharedCounter);
    }

    //SQL Injection

    private Connection connection;

    public void queryDatabase(String tableName, String columnName, String value) {
        try {
            String query = "SELECT * FROM " + tableName + " WHERE " + columnName + "='" + value + "'";
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            // ...
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    //XSS

    public void renderResponse(HttpServletRequest request, HttpServletResponse response) throws Exception {
        String userInput = request.getParameter("userInput");

        // This line could potentially lead to an XSS vulnerability
        // because it directly uses user input in 'document.write'
        String script = "<script>document.write('" + userInput + "');</script>";
        response.getWriter().write(script);
    }

    public void safeRenderResponse(HttpServletRequest request, HttpServletResponse response) throws Exception {
        String userInput = request.getParameter("userInput");

        // Here, userInput is sanitized before being used, which is a safer approach
        String safeUserInput = sanitize(userInput);
        String script = "<script>document.write('" + safeUserInput + "');</script>";
        response.getWriter().write(script);
    }

    private String sanitize(String input) {
        // Implementation of input sanitization to prevent XSS
        // This would include escaping HTML, JavaScript, or other relevant entities
        return input.replaceAll("<", "&lt;").replaceAll(">", "&gt;");
    }
}
