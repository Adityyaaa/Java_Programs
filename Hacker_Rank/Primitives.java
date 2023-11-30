import java.io.*;
import java.util.*;

public class Primitives {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i;
        
        for(i = 0; i < n; i++) {
            
            try{
            long num;
            num = sc.nextLong();
        
        if(num >= -128 && num <= 127) {
            System.out.println(num + " can be fitted in: ");
            System.out.println("* byte");
            System.out.println("* short");
            System.out.println("* int");
            System.out.println("* long");
        }
        else if(num >= -32768 && num <= 32767) {
            System.out.println(num + " can be fitted in: ");
            System.out.println("* short");
            System.out.println("* int");
            System.out.println("* long");
        }
        else if(num >= (int)Math.pow(-2,31) && num <= (int)(Math.pow(2,31)-1)) {
            System.out.println(num + " can be fitted in: ");
            System.out.println("* int");
            System.out.println("* long");
        }
        else if(num >= (int)Math.pow(-2,63) && num <= (int)(Math.pow(2,63)-1)) {
            System.out.println(num + " can be fitted in: ");
            System.out.println("* long");
        }
            }
            catch(Exception e){
            System.out.println(sc.next() + " can't be fitted anywhere.");
        }
    }
}
}