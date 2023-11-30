import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int num, a, rev =0;
        System.out.print("Enter number: ");
        num = in.nextInt();
        while (num > 0) {
            a = num % 10;
            num = num / 10;
            rev = rev *10 + a;
        }
        System.out.println("Reverse: " + rev);
        in.close();
    }
}
