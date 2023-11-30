import java.util.*;

public class Leetcode1672 {
    public static void main(String[] args) {
        
        int [][] accounts = {{1,2,3},{2,4,5}};
        System.out.println(maximumWealth(accounts));
    }

    static int maximumWealth(int[][] accounts) {
        
        // int ans = accounts[0][0];
        int ans = Integer.MIN_VALUE;
        for(int person = 0; person < accounts.length; person++) {
            int sum = 0;
            for(int account = 0; account < accounts[person].length; account++) {
                sum += accounts[person][account];
            }

            if(sum > ans){
                ans = sum;
            }
        }
        return ans;
    }
}
