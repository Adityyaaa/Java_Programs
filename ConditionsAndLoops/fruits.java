

import java.util.Scanner;

public class fruits {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        System.out.print("Enter fruit: ");
        String fruit = in.next();

        switch (fruit) {

            case "mango" : 
            System.out.println("King of fruits");
            break;

            case "banana" :
            System.out.println("Long fruit");
            break;

            default :
            System.out.println("Invalid Choice");
        }
        in.close();
    }
}
