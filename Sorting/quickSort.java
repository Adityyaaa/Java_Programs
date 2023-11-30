import java.util.*;

public class quickSort {
    public static void main(String[] args) {
        int [] arr = {10,4,5,3,1,5};
        int n = arr.length;
        qSort(arr, 0, n-1);
        for(int i = 0; i< arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }

    static void qSort(int[] arr, int low, int high) {
        if(low<high) { 
            int par = part(arr, low, high);
            qSort(arr, low, par-1);
            qSort(arr, par+1, high);
        }
    }

    static int part(int [] arr, int low, int high) {
        int pivot = arr[high];
        int i = (low -1);

        for(int j = low; j <= high-1; j++) {
            if(arr[j] < pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i+1, high);
        return(i+1);
    }

    static void swap( int [] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}