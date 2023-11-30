import java.util.Scanner;

public class leet_248 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int [n];
        
        for( int j = 0; j< arr.length; j++) {
            arr[j] = sc.nextInt();
        }
        int i = 0;
        while( i < n) {
            int correct = arr[i];
            if(arr[i] < n && arr[i] != arr[correct]) {
                int temp = arr[i];
                arr[i] = arr[correct];
                arr[correct] = temp;
            }
            else {
                i++;
            }
        }

        for ( int k = 0; k < n; k++) {
            if(arr[k] != k) {
                System.out.println(k);
                break;
            }
        }
    }
}