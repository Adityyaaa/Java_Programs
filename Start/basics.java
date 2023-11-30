// public class basics {
//     public static void main(String[] args) {

//         // int a = 20;
//         // if (a == 20) {
//         //     System.out.println("Hello");
//         // }

//         // int count = 1;
//         // while (count != 5) {
//         //     System.out.println(count);
//         //     count ++;
//         // }

//         for(int count = 1; count !=5; count ++)  {
//             System.out.println(count); 
//         }
//     }
// }

import java.util.*;

public class basics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = fun(a);
        System.out.println(b);
        sc.close();
    }

    public static String fun(String s) {
        String x = "";
    if(s.substring(0,2).equals("12") && s.contains("AM")) {
        x = ("00");
        s = x + s.substring(2,s.length());
    }
    
    if(!s.substring(0,2).equals("12") && s.contains("PM")) {
        x = Integer.toString(Integer.parseInt(s.substring(0,2)) + 12);
        s = x + s.substring(2,s.length());
    }
    return s.substring(0,s.length()-2);
    }
}