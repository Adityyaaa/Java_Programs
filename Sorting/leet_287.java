import java.util.*;

public class leet_287 {
    public static void main(String[] args) {
        int[] arr = { 3, 1, 3, 4, 2 };
        System.out.println(findDuplicate(arr));
    }

    static int findDuplicate(int[] arr) {
        // int i =0;
        // while(i < arr.length) {
        // int correct = arr[i] -1;
        // if(arr[i] != arr[correct]) {
        // swap(arr, i, correct);
        // }
        // else {
        // i++;
        // }
        // }

        // for(int index = 0; index < arr.length; index++) {
        // if(arr[index] != index + 1) {
        // System.out.println(arr[index]);;
        // }
        // System.out.println(-1);
        // }

        int i = 0;
        while (i < arr.length) {

            if (arr[i] != i + 1) {
                int correct = arr[i]- 1;
                if (arr[i] != arr[correct]) {
                    int temp = arr[i];
                    arr[i] = arr[correct];
                    arr[correct] = temp;
                } else {
                    return arr[i];
                }
            }
            else {
                i++;
            }        
        }
        return -1;
    }

    // static void swap(int [] arr, int i, int correct) {
    // int temp = arr[i];
    // arr[i] = arr[correct];
    // arr[correct] = temp;
    // }
}