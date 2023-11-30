public class overloading {
    public static void main(String[] args) {
        
        fun (43);
        fun ("Hello bhai!");
        sum (2,3,4);
        sum (4,5);
    }

    static void fun (int a) {
        System.out.println("FIRST");
        System.out.println(a);
    }

    static void fun (String ch) {
        System.out.println("SECOND");
        System.out.println(ch);
    }

    static void sum (int a, int b, int c) {
        System.out.println(a+b+c);
    }

    static void sum (int a, int b) {
        System.out.println(a+b);
    }
}
