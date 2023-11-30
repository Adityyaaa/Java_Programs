import java.util.*;

public class comparision {
    public static void main(String[] args) {
        String a = "Aditya";
        String b = "Aditya";
        String c = a;

        System.out.println(b == a);

        String name1 = new String("Tanya");
        String name2 = new String("Tanya");

        System.out.println(name1==name2);
        System.out.println(name1.equals(name2));

        System.out.println(name1.charAt(0));
    }
}
