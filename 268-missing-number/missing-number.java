class Solution {
    public int missingNumber(int[] nums) {
        int total_sum=0,i=0;
        for(i=0;i<nums.length;i++){
            total_sum+=i-nums[i];
        }
        return total_sum+i;
    }
}