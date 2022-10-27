class Solution {
    public int search(int[] nums, int target) {
        // by for loop time complexity will be O(n^2)
        // so for time complexity O(log n) ww will do binary search
        int n = nums.length;
        if(n == 0){
            return -1;
        }
        int start =0;
        int end = n-1;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(nums[mid] == target){
                return mid;
            }else if(nums[mid] < target){
                start = mid + 1;
                //return start;
            }else {
                end = mid - 1;
            }
        }
        
        return -1;
    }
}