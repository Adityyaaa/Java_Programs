import java.util.*;

public class calculator {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int ans = 0;
        while (true) {

            System.out.print("Enter operator: ");
            char op = in.next().trim().charAt(0);
            if (op == '+' || op == '-' || op == '*' || op == '/' ||op == '%') {

                System.out.print("Enter two number: ");
                int num1 = in.nextInt();
                int num2= in.nextInt();        

                if (op == '+') {
                    ans = num1 + num2;
                }

                else if (op == '-') {
                    ans = num1 - num2;
                }

                else if (op == '*') {
                    ans =  num1 * num2;
                }

                else if (op == '/') {
                    if (num2 != 0) {
                        ans = num1 / num2;
                    }
                }

                else if (op == '%') {
                    ans = num1 % num2;
                }
            }

            else if (op == 'x' || op == 'X') {
                break;
            }

            else {
                System.out.println("Invalid Choice");
            }
            System.out.println("Answer: " + ans);

        }
        in.close();
    }
}
