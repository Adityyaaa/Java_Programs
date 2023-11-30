import java.io.*;
import java.util.*;

public class Palindrome {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        int l = A.length();
        String h = "";
        for(int i = l-1; i>= 0; i--) {
            h+= A.charAt(i);
        }
        if(A.equals(h))
        System.out.println("Yes");
        else
        System.out.println("No");
        /* Enter your code here. Print output to STDOUT. */
        
    }
}



