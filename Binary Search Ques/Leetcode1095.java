import java.util.*;

public class Leetcode1095 {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,3,1};
        int target = 2;
        int ans = search(arr, target);
        System.out.println(ans);
    }

    int search(int [] arr, int target) {
        int peak = peakIndexInMountainArray(arr);
        int firstTry =  OrderAgnosticBinarySearch(arr, target, 0, peak);
        if(firstTry != -1) {
            return firstTry;
        }

        //try search in second half
        return OrderAgnosticBinarySearch(arr, target, peak+1, arr.length-1);
    }

    public int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        
        while(start < end) {
            int mid = start + (end - start) / 2;
            if(arr[mid] > arr[mid + 1]) {
                //you are in the dec part of the array
                //this may be the ans, but look at left
                //this is why end != mid -1
                end= mid;
            }

            else {
                //you are in asc part of array
                start = mid + 1;   //because we know that mid + 1 element > mid element
            }
        }
        //in the end, start == end and pointing to the largest number because of the 2 checks above
        //start and end are always trying to find max element in the above 2 checks
        //hence, when they are pointing to just one element, that is the max element because that is what the checks say
        //more elaboration: at every point of time for start and end, they have the best possible answer till that time
        // and if we are saying that only one item is remaining, hence cuz of above line that is the best possible ans
        return start;   //or return end as both have same value
    }

    static int OrderAgnosticBinarySearch(int [] arr, int target, int start, int end) {

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
