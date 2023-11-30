import java.io.*;
import java.util.*;

public class Strings {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner sc=new Scanner(System.in);
        String a=sc.next();
        String b=sc.next();
        int x = a.length();
        int y = b.length();
        String s="", t="";
        s += Character.toUpperCase(a.charAt(0));
        t += Character.toUpperCase(b.charAt(0));
        System.out.println(x + y);
        if (a.compareTo(b) > 0) {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
        for(int i = 1;i<a.length();i++)
        s+=a.charAt(i);
        for(int i = 1;i<b.length();i++)
        t+=b.charAt(i);
        
        System.out.println(s+" "+t);
    }
}
