class Solution {
    public int mostFrequentEven(int[] nums) {
        Map<Integer,Integer> map = new TreeMap<>();
        int n = nums.length;
        //int ans =0;
        
        for(int i=0;i<n;i++){
            if(nums[i] % 2 == 0){
                map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        }
        int maxFrequency = -1;
        int maxNumber = -1;
        for(Integer num : map.keySet()){
            if(map.get(num) > maxFrequency){
                maxFrequency = map.get(num);
                maxNumber = num;
            }
        }
        return maxNumber;
    }
}