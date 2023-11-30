import java.util.*;

public class ceiling {
    public static void main(String[] args) {
        int [] arr = {-12, -5, -2, 0, 5, 9, 15, 29, 35};
        int target = 36;
        int ans = Ceiling(arr, target);
        System.out.println(ans);
    }

    static int Ceiling(int [] arr, int target) {

        if(target > arr[arr.length - 1]) {      //if target is the greatest than the greatest element in the array
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
        return arr[start];
    }
}
