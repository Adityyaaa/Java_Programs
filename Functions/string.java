import java.util.Scanner;

public class string {
    public static void main(String[] args) {
        
        // String message = greet ();
        // System.out.println(message);

        Scanner in = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = in.next();
        String alert = greeting (name);
        System.out.println(alert);
        in.close();
    }

    static String greeting (String name) {
        String message = "Hello, " + name;
        return message;
    }

    static String greet () {
        String greeting = "Good morning!";
        return greeting;
    }
}
