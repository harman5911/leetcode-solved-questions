class Solution {
    public int mySqrt(int x) {
        // Binary Search
        int start = 0;
        int end = x;
        int ans =0;
        while(start <= end){
            int mid = start + (end - start)/2;
            long temp = (long)mid * (long)mid;
            if(temp == x){
                return mid;
            }
            else if(temp < x){
                ans = mid;
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }
        return ans;
    }
}