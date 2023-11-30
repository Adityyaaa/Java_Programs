import java.util.Scanner;

public class swap {
    public static void main(String[] args) {
        
        Scanner in = new Scanner (System.in);
        System.out.print("Enter two numbers: ");
        int a = in.nextInt();
        int b = in.nextInt();
        Swap (a,b);
        in.close();
    }

    static void Swap (int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        System.out.println("a:" + a + " b:" + b);
    }
}