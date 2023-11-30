import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        // System.out.print("Enter roll no: ");
        // int roll= input.nextInt();
        // System.out.println("Your roll no is "+ roll);
        

        String name= input.nextLine();
        System.out.println(name);

        float marks= input.nextFloat();
        System.out.println(marks);
        input.close();
    }
}