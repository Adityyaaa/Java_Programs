// import java.io.*;
// import java.util.*;

// public class Loops {

//     public static void main(String[] args) {
//         /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
//         Scanner sc = new Scanner(System.in);
//         int num = sc.nextInt();
//         int sum = 0;
//         int i;
//         for( i = 0; i < num; i++) {
//             int a = sc.nextInt();
//             int b = sc.nextInt();
//             int n = sc.nextInt();
            
//             for( i = 0; i < n; i++) {
//                 sum = (int)(a + ((int)Math.pow(2,i)*b));
//                 System.out.println(sum + " ");
//             }
//         }
//     }
// }





import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int i, j;
        for(i = 0; i < num; i++)  {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int n = sc.nextInt();
            
            for( j = 0; j < n; j++) {
                a = a +(int)((Math.pow(2,j)*b));
                System.out.print(a + " ");
            }
            System.out.println();
        }
    }
}







