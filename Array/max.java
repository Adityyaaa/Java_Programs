import java.util.*;

public class max {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int [] arr = new int[5];
        for(int i = 0; i < arr.length ; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println("Max value: " + max(arr));
        System.out.println("Max Value: " + maxRange(arr, 1, 4));
        in.close();
    }

    static int max (int [] arr) 
    {
        if (arr.length == 0)
        {
            return -1;
        }
        int maxVal = arr[0];
        for (int i = 1; i < arr.length; i++ )
        {
            if ( arr[i] > maxVal)
            {
                maxVal = arr [i];
            }
        }
        return maxVal;
    }

    static int maxRange (int [] arr, int start, int end) 
    {
        int maxVal = arr[start];
        for (int i = start; i < end; i++ )
        {
            if ( arr[i] > maxVal)
            {
                maxVal = arr [i];
            }
        }
        return maxVal;
    }
}
