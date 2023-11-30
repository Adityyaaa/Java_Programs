import java.util.Scanner;

public class sumFun {
    public static void main(String[] args) {
        
        // int ans = sum ();
        // System.out.println("Sum: " + ans);

        Scanner in = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int ans = sum2 (num1 , num2 );
        System.out.println(ans);
        in.close();
    }

    // Pass the value of the numbers when you are calling in main ()
    static int sum2 (int a, int b) {

        int sum2 = a + b;
        return sum2;
    }
    
    // Returns a value-
    static int sum () {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter two number: ");
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int sum = num1 + num2;
        return sum;
        // in.close();
    }
}


//Syntax of function-

// return_type name (arguments) {
//     body
//     return_type;
// }