import java.util.Scanner;

public class Main {
    public static void main (String[] args) {

        // Syntax of if statements:
        // if(boolean expression: T or F)   {
        //     //body
        // }
        // else {
        //     //body
        // }

  
        Scanner in = new Scanner(System.in);
        int salary = in.nextInt();
        // if(salary > 10000)  {
        //     salary = salary + 2000;
        // }
        // else {
        //     salary = salary + 1000;
        // }
        // System.out.println(salary);
        // }


        // Multiple if-else
        
        if(salary > 10000)  {
            salary += 2000;
        }

        else if (salary > 20000)  {
            salary += 3000;
        }
        System.out.println(salary);
        in.close();
    }
} 