// Time Complexity : O(n) = costs.length
// Space Complexity : O(n) extra dp as e=recommended in class
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

/*
For each house save old dp[0][[1][2] so it is not replaced
update house cost by considering min cost of painting previous 2 houses of diff color
return min cost
 */

class PaintHouse {
    public int minCost(int[][] costs) {
        if(costs==null || costs.length==0){
            return 0;
        }
        int n = costs.length;
        int[] dp = new int[3];
        dp[0]=costs[n-1][0];
        dp[1]=costs[n-1][1];
        dp[2]=costs[n-1][2];
        for(int i=n-2;i>=0;i--){
            int prevRed = dp[0];
            int prevBlue = dp[1];
            int prevGreen = dp[2];
            dp[0]=costs[i][0]+Math.min(prevBlue,prevGreen);
            dp[1]=costs[i][1]+Math.min(prevRed,prevGreen);
            dp[2]=costs[i][2]+Math.min(prevRed,prevBlue);
        }
        return Math.min(dp[0], Math.min(dp[1],dp[2]));
    }

    public static void main(String[] args) {
        PaintHouse obj = new PaintHouse();
        int [][] costs = { {17,2,17},{16,16,5},{14,3,19}};
        System.out.println(obj.minCost(costs));
    }
}