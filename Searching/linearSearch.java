

public class linearSearch {
    public static void main(String[] args) {

        int [] nums = {12,34,56,7,8,45,67};
        int target = 45;
        int ans = LinearSearch(nums, target);
        System.out.println(ans);
    }

    // search the element
    static int LinearSearch ( int [] arr, int target)
    {
        if (arr.length == 0)
        {
            return -1;
        }

        for ( int index = 0; index < arr.length; index++)
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
