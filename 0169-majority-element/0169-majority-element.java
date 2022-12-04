class Solution {
    public int majorityElement(int[] nums) {
        /*
        int n = nums.length;
        int res = nums[0];
        int count =1;
        
        for(int i=0;i<n;i++){
            if(res == nums[i]){
                count++;
            }else{
                count--;
            }
            if(count == 0){
                res = nums[i];
                count = 1;
            }
        }
        return res;
        */
        
        // By using Hashmap
        HashMap<Integer,Integer> map = new HashMap<>();
        int n = nums.length;
        int ans =0;
        for(int i=0;i<n;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }else{
                map.put(nums[i],1);
            }
        }
        
        for(int key : map.keySet()){
            if(map.get(key) > n/2){
                ans = key;
            }
        }
        return ans;
    }
}