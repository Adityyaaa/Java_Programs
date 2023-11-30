import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int a = 0;
        int b = 1;
        int c,i;
        System.out.print("Enter number: ");
        int num = in.nextInt();
        System.out.println("Series is ");
        System.out.println(a);
        System.out.println(b);
        for( i = 1; i < num-1; i++)
        {
            c = a + b;
            System.out.println(c);
            a=b;
            b=c;
        }
        in.close();
    }
}
