import java.util.Scanner;

public class caseCheck {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        char ch = in.next().trim().charAt(0);
        System.out.println(ch);

        // int a = 10;
        // int b = 20;

        // if (a == 10 && b == 20) {
        //     System.out.println("Hello World!");
        // }

        if (ch >= 'a' && ch<= 'z') {
            System.out.println("Lowercase");
        }
        else {
            System.out.println("Uppercase");
        }
        in.close();
    }
}
