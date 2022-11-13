class Solution {
    public boolean isPerfectSquare(int num) {
        // BY BINARY SEARCH
        long left = 0;
        long right = num;
        
        while(left <= right){
            long mid = left + (right - left)/2;
            long t = mid * mid;
            if(t == num){
                return true;
            }else if(t<num){
                left = mid + 1;
            }else{
                right = mid-1;
            }
        }
        return false;
    }
}