import java.io.*;
import java.util.*;

public class Static_Initializer_Block {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
            Scanner sc = new Scanner(System.in);
            int b = sc.nextInt();
            int h = sc.nextInt();
            try{
            if(b >= 0 && h >= 0) {
                int res = b*h;
                System.out.println(res);
            }
            else if(b < 0 || h < 0) {
                System.out.println ("Breadth and height must be positive");
            }
            }catch(Exception e) {
                System.out.println(e);
            }
            sc.close();
    }
}
