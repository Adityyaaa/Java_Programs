package singleton;

public class main {
    public static void main(String[] args) {
        singleton obj = singleton.getInstance();

        singleton obj1 = singleton.getInstance();

        singleton obj2 = singleton.getInstance();
    }
}
