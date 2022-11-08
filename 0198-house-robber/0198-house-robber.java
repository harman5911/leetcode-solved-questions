class Solution {
    public int rob(int[] nums) {
        //int n = nums.length;
        //int sum =0;
        //for(int i=0;i<n;i = i +2){
          //  sum = sum + nums[i];
        //}
        //return sum;
        
        // Take two variable even and odd
        if(nums == null || nums.length == 0)
            return 0;
        
        int even =0;
        int odd =0;
        
        for(int i=0;i<nums.length;i++){
            if(i % 2 == 0){
                even = even + nums[i];
                even = even>odd ? even:odd;
            }else{
                odd = odd + nums[i];
                odd = odd > even ? odd:even;
            }
        }
        return even > odd ? even : odd;
    }
}