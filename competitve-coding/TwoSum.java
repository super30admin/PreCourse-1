/*
TC: O(n) size of array
SC: O(n) size of hashmap
save the index for lookup of diff and determine when next time diff is found
 */
import java.util.Arrays;
import java.util.HashMap;

class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int [] result = new int[2];
        if(nums==null || nums.length==0){
            return result;
        }
        HashMap<Integer, Integer> map =new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int diff = target-nums[i];
            if(map.containsKey(nums[i])){
                result[0]=i;
                result[1]=map.get(nums[i]);
            } else {
                map.put(diff, i);
            }
        }
        return result;
    }

    public static void main(String[] args) {
       System.out.println(Arrays.toString(new TwoSum().twoSum(new int[]{2,7,1,2,4}, 9)));
    }
}