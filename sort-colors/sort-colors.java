class Solution {
    public void sortColors(int[] nums) {
        // DNF Sot
        int n = nums.length;
        int low =0;
        int mid =0;
        int high = n-1;
        int temp ;
        
        while(mid <= high){
            if(nums[mid] == 0){
                temp = nums[low];
                nums[low] = nums[mid];
                nums[mid] = temp;
                low++;
                mid++;
                continue;
            }
            if(nums[mid] == 1){
                mid++;
                continue;
            }
            if(nums[mid] == 2){
                temp = nums[mid];
                nums[mid] = nums[high];
                nums[high] = temp;
                high--;
                continue;
            }
        }
    }
   
}