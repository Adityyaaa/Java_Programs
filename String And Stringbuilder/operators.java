import java.util.*;

public class operators {
    public static void main(String[] args) {
        System.out.println('a' + 'b');
        System.out.println("a" + "b");
        System.out.println((char)('a' + 3 ));
        System.out.println("a" + 1);
        System.out.println("Aditya" + new ArrayList<>());
        System.out.println("Aditya" + new Integer(45));
        String ans = new Integer(45) + " " + new ArrayList<>();
        System.out.println(ans);
    }
}
