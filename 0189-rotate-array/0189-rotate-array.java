class Solution {
    public void reverse(int[] nums,int start,int end){
        while(start<end){
        int temp = nums[start];
        nums[start] = nums[end];
        nums[end] = temp;
        start++;
        end--;
    }
    }
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        if(nums == null || nums.length ==0){
            return;
        }
        int offset = k%n;
        reverse(nums,0,n-1);
        reverse(nums,0,offset-1);
        reverse(nums,offset,n-1);
    }
}