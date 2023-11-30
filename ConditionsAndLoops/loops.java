import java.util.Scanner;

public class loops {
    public static void main(String[] args) {

        // Syntax of for loop-
        // for( initialization; condition; inc/dec) {
        //     body;
        // }

        //Q: Print numbers from 1 to 5-
        // for( int num = 1; num <=5; num++)  {
        //     System.out.println(num);
        // }

        Scanner in = new Scanner(System.in);
        System.out.print("Enter number ");
        int num = in.nextInt();
        
        // for(int i =1; i <= num; i++ )  {
        //     System.out.println(i);
        // }


        //Syntax of while loop-
        // while (condition) {
        //     body
        // }
        

        // int i=1;
        // while (i <= num) {
        //     System.out.println(i);
        //     i++;
        // }


        // Syntax of do-while loop-
        // do {
        //     //body
        // }while (condition);


        int n =1;
        do {
            System.out.println(n);
            n++;
        } while (n <= num);
        in.close();
    }
}
