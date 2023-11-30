public class array {
    public static void main(String[] args) {
        
        // Syntax of array-
        // datatype [] variable_name = new datatype [size];

        int [] num = new int [5];      // new is a keyword used to create objects

        //or directly-
        int [] num2 = {1,2,3,4};
        
        int [] dec;           //declaration of array which is stored in stack
        dec = new int [40];           //initialization: actually here object is be created in the heap memory

        System.out.println(num[2]);

        String [] arr = new String [5];
        System.out.println(arr[2]);
    }
}