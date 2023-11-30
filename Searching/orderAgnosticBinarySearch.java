import java.util.*;

public class orderAgnosticBinarySearch {
    public static void main(String[] args) {
        // int [] arr = {-12, -5, -2, 0, 5, 9, 15, 29, 35};
        int [] arr = {86, 45, 26, 12, 5, -1, -6, -45, -86};
        int target = -45;
        int ans = OrderAgnosticBinarySearch(arr, target);
        System.out.println(ans);
    }

    static int OrderAgnosticBinarySearch(int [] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        //Find whether array is sorted in ascending or descending order
        // boolean isAsc {
        //     if(arr[start] < arr[end]) {
        //         isAsc = true;
        //     }
        //     else {
        //         isAsc = false;
        //     }
        // }

        boolean isAsc = arr[start] < arr[end];

        while(start <= end) {
            //int mid = (start + end) / 2;     //if we are calculating for large values it may exceeds the limit for int and may give an error
            int mid = start + (end - start) / 2;           //Alternative way to not get an error

            if(target == arr [mid]) {
                return mid;
            }

            if(isAsc) {
                if(target < arr[mid]) {
                    end = mid - 1;
                }
                else if(target > arr[mid]) {
                    start = mid + 1;
                }
            }

            else {
                if(target > arr[mid]) {
                    end = mid - 1;
                }
                else if(target < arr[mid]) {
                    start = mid + 1;
                }
            }
            
        }
        return -1;
    }
}