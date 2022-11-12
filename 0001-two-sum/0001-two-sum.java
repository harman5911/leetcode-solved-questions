class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        int sum =0;
        for(int i=0;i<n;i++){
           for(int j=i + 1;j<n;j++){
               int complement = target - nums[i];
               
               if(complement == nums[j]){
                   return new int[] {i,j};
               }
           }
        }
        return nums;
    }
}