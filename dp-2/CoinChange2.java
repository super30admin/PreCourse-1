// Time Complexity : O(m*n) m = coins array len and n = 0-amount-1
// Space Complexity : O(m*n)
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this : No

/*
initialize base to 1
build table for how to make each amount for given coin
 */

class CoinChang2 {
    public int change(int amount, int[] coins) {
        if(coins == null || coins.length==0){
            return 0;
        }
        int [][] dp = new int[coins.length+1][amount+1];
        for(int i=0;i<coins.length+1;i++){
            dp[i][0]=1;
        }
        for(int i=1;i<coins.length+1;i++){
            for(int j=1;j<=amount;j++){
                dp[i][j]=dp[i-1][j];
                if(j>=coins[i-1]){
                    dp[i][j] += dp[i][j - coins[i - 1]];
                }
            }
        }
        return dp[coins.length][amount];
    }

    public static void main(String[] args) {
        CoinChang2 obj = new CoinChang2();
        int [] coins = { 1,2,5};
        System.out.println(obj.change(5,coins));
    }
}