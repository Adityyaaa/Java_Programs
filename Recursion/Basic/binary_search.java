import java.util.*;

public class binary_search {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        n = in.nextInt();
        int [] arr = new int [n];
        System.out.println("Enter numbers- ");
        for(int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        int target = in.nextInt();
        System.out.println(search(arr, target, 0, arr.length-1));
        in.close();
    }
 
    static int search(int [] arr, int target, int s, int e) {
        if(s>e) {
            return -1;
        }
        int m = s + (e-s)/2;

        if(target == arr[m]) {
            return m;
        }

        else if (target > arr[m]) {
            return search(arr, target, m+1, e);
        }

        else {
            return search(arr, target, s, m-1);
        }
    }
}
