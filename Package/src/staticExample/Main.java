package staticExample;

public class Main {

    
    public static void main(String[] args) {
        Human aditya = new Human(19, "Aditya Awasthi",10000, false);
        Human rahul = new Human(20,"Rahul Bhangi", 20000, true);

        System.out.println(aditya.name);
        System.out.println(aditya.population); 

        M

        // greeting();
    }

    static void fun() {
        // greeting(); // you cannot use this becasue it requires an instance but the function you are using it in does not depend in instances
        

        // you cannot access non static stuff without referncing their instances in a static context

        // hence here i am referencing it
        Main obj = new Main();
        obj.greeting();
    }

    void fun2() {
        greeting();
    }

    void greeting() {
        // fun();
        System.out.println("Hello World!");
    }
}
