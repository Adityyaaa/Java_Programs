// public class Main {
//     public static void main (String [] args) {
//         System.out.println("Hello World!");
//     }
// }


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter anything \n");
        Scanner input = new Scanner(System.in);
        System.out.println(input.nextLine());
        input.close();
    }
}