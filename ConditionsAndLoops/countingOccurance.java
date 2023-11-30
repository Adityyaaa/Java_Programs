import java.util.Scanner;

public class countingOccurance {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = in.nextInt();
        int a, n;
        System.out.print("Enter number to be search: ");
        n = in.nextInt();
        int count=0;
        while (num > 0) {
            a = num % 10;
            if(a == n) {
                count++;
            }
            num = num / 10;
        }
        System.out.println("Count: " + count);
        in.close();
    }
}