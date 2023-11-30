import java.util.*;

public class floor {
    public static void main(String[] args) {
        int [] arr = {-12, -5, -2, 0, 5, 9, 15, 29, 35};
        int target = -12;
        int ans = Floor(arr, target);
        System.out.println(ans);
    }

    static int Floor(int [] arr, int target) {

        if(target < arr[arr.length - 1]) {      //if target is the smaller than the smallest element in the array
            return -1;
        }

        int start = 0;
        int end = arr.length - 1;

        while(start <= end) {
            //int mid = (start + end) / 2;     //if we are calculating for large values it may exceeds the limit for int and may give an error
            int mid = start + (end - start) / 2;           //Alternative way to not get an error

            if(target < arr[mid]) {
                end = mid - 1;
            }
            else if(target > arr[mid]) {
                start = mid + 1;
            }
            else {
                return mid;
            }
        }
        return arr[end];
    }
}
