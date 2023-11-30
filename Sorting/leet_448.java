import java.util.*;

class leet_448 {
    int [] arr = {4,3,2,7,8,2,3,1};
    System.out.println(findDisappearedNumbers(arr));

    public List<Integer> findDisappearedNumbers(int[] arr) {
        int i =0;
        while(i < arr.length) {
            int correct = arr[i] -1;
            
            if(arr[i] != arr[correct]) {
                swap(arr, i, correct);
            }
            else {
                i++;
            }
        }

        //just find missing numbers
        List<Integer> ans = new ArrayList<>();
        for(int index = 0; index < arr.length; index++) {
            if(arr[index] != index + 1) {
                ans.add(index + 1);
            }
        }
        return ans;
    }

    static void swap(int [] arr, int i, int correct) {
        int temp = arr[i];
        arr[i] = arr[correct];
        arr[correct] = temp;
    }
}