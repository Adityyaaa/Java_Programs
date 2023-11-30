import java.util.*;

public class arrayList {
    public static void main(String[] args) {
        
        //Syntax-
        ArrayList <Integer> list = new ArrayList<Integer>(10);

        // list.add(10);
        // list.add(20);
        // list.add(30);
        // list.add(40);
        // list.add(50);
        // list.add(60);
        // list.add(70);

        // System.out.println(list);
        // System.out.println(list.contains(10));
        // list.set(0, 15);
        // list.remove(2);
        // System.out.println(list);


        //input-

        Scanner in = new Scanner(System.in);
        System.out.print("Enter elements: ");
        for (int i = 0; i < 5; i++)
        {
            list.add(in.nextInt());
        }

        //get items at index-

        System.out.println("Output: ");
        for ( int i = 0; i< 5; i++)
        {
            System.out.println(list.get(i));    //pass index here, list[index] will not work here
        }
        System.out.println(list);
        in.close();
    }
}
