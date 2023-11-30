import java.util.*;

public class searchInRange {
    
    public static void main(String[] args) {

        int [] nums = {18, 12, -7, 3, 14, 28};
        int target = 18;
        int ans = LinearSearch(nums, target, 1,4);
        System.out.println(ans);
    }

    // search the element
    static int LinearSearch ( int [] arr, int target, int start, int end)
    {
        if (arr.length == 0)
        {
            return -1;
        }

        for ( int index = start; index < end; index++)
        {
            int element =arr[index];
            if (element == target)
            {
                return index;
            }
        }
        //if none of the return statement above run then this will be default return
        //element not found
        return -1;
    }
}
