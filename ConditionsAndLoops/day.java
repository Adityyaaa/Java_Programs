import java.util.Scanner;

public class day {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter day: ");
        int day = in.nextInt();

        switch (day) {

            case 1 -> System.out.print("Monday");
            case 2 -> System.out.print("Tuesday");
            case 3 -> System.out.print("Wednesday");
            case 4 -> System.out.print("Thursday");
            case 5 -> System.out.print("Friday");
            case 6 -> System.out.print("Saturday");
            case 7 -> System.out.print("Sunday");
        }
        in.close();
    } 
}
