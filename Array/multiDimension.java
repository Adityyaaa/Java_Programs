

import java.util.Arrays;

import java.util.Scanner;

public class multiDimension {
    public static void main(String[] args) {
        
        // int [] arr2D = {
        //     {1,2,3},
        //     {4,5},
        //     {6,7,8}
        // };

        int [][] arr = new int [3][3];
        System.out.print("Length is: ");
        System.out.println(arr.length);  //print the number of rows

        Scanner in = new Scanner(System.in);
        System.out.print("Enter elements: ");

        //input-
        for (int row = 0; row < arr.length; row++) 
        {
            for (int col = 0; col < arr[row].length; col++)
            {
                arr [row][col] = in.nextInt();
            }
        }

        // output-
         System.out.println("Output: ");
        // for (int row = 0; row < arr.length; row++) 
        // {
        //     for (int col = 0; col < arr[row].length; col++)
        //     {
        //         System.out.print(arr [row][col] + " ");
        //     }
        //     System.out.println();
        // }

        // for (int row = 0; row < arr.length; row++)
        // {
        //     System.out.println(Arrays.toString (arr[row]));
        // }

        for (int [] a : arr) 
        {
            System.out.println(Arrays.toString(a));
        }

        in.close();
    }
}
