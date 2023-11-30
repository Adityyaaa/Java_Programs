

import java.util.Scanner;

import java.util.Arrays;

public class input {
    public static void main(String[] args) {
        
        //array of primitives-

        // int [] arr = new int [5];
        Scanner in = new Scanner(System.in);
        // System.out.print("Enter elements: ");
        // for ( int i =0; i < arr.length; i++)
        // {
        //     arr[i] = in.nextInt();
        // }

        // System.out.print("Elements are: ");

        // for ( int i = 0; i < arr.length; i++)
        // {
        //     System.out.println(arr[i]);
        // }

        // System.out.println(Arrays.toString(arr));

        // for (int num : arr)
        // {
        //     System.out.println(num + " ");
        // }


        // array of objects-
        
        String [] str = new String [4];
        System.out.println("Enter elements: ");
        for ( int i = 0; i < str.length; i++)
        {
            str[i] = in.next();
        }

        System.out.println(Arrays.toString(str));

        //modify-
        str [1] = "Yahoo!";
        System.out.println(Arrays.toString(str));
        in.close();
    }
}