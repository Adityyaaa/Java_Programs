import java.util.Scanner;

public class nestedSwitch {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter case: ");
        int a = in.nextInt();

        switch (a) {

            case 1 -> System.out.println("Hello");
            case 2 -> System.out.println("Hey");
            case 3 -> {
                System.out.println("number 3");
                System.out.print("Enter string: ");
                String ch = in.next();

                switch (ch) {
                    case "one" -> System.out.println("Hello 1");
                    case "two" -> System.out.println("Hello 2");
                }
            }
        }
        in.close();
    }
}
