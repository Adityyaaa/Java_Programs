import java.util.Scanner;

public class largest {
    public static void main(String[] args)  {
        Scanner in = new Scanner(System.in);  {

            System.out.println("Enter three number: ");

            int a = in.nextInt();
            int b = in.nextInt();
            int c = in.nextInt();

            // Q:Find the largest

            // if (a > b ) {
            //     if (a > c ) {
            //         System.out.println("Largest number: " + a);
            //     }
            // }

            // else {
            //     if (b > c) {
            //         System.out.println("Largest number: " + b);
            //     }

            //     else {
            //         System.out.println("Largest number: " + c );
            //     }
            // }


            // int max = a;
            // if (b > max) {
            //     max = b ;
            // }

            // if (c > max) {
            //     max = c;
            // }


            int max = Math.max(c, Math.max(a, b));
            System.out.println("Largest number: " + max );
            in.close();
        }
    }
}
