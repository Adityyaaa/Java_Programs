import java.util.Arrays;

public class varAgrs {
    public static void main(String[] args) {
        
        // fun(1,2,3,556,77,8);   //we do not know the length of the array so we use varArgs method to insert 0 to n number of elements in array
                        
        multiple (4,5,"Hello");

        demo (2,3,4,5,6);

        demo ("Aditya","Ahana","Saira");

        cum("Betrayed", "Me", "!");

        shot("h","h","h");
    }

    static void multiple (int a, int b, String ...v) {      //variable length arguments always comes at the end
        // System.out.println(a);
        // System.out.println(b);
        System.out.println(Arrays.toString(v));
    }

    static void fun (int ...v) {
        System.out.println(Arrays.toString(v));   //variable length arguments.
    }

    static void demo (int ...v) {
        System.out.println(Arrays.toString(v));
    }

    static void demo (String ...v) {
        System.out.println(Arrays.toString(v));
    }

    static void cum(String ...v) {
        System.out.println(Arrays.toString(v));
    }
    static void shot(String ...v) {
        System.out.println(Arrays.toString(v));
    }
}
