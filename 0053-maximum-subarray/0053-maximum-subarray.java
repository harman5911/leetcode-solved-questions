class Solution {
    public int maxSubArray(int[] nums) {
        // Kadane's Algorithm
        int n = nums.length;
        int maxarray = nums[0];
        int sumarray =0;
        
        for(int i=0;i<n;i++){
            sumarray = sumarray + nums[i];
        
        if(sumarray > maxarray){
            maxarray = sumarray;
        }
        if(sumarray < 0){
            sumarray = 0;
           // return -1;
        }
        }
        return maxarray;
    }
}