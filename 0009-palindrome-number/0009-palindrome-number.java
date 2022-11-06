class Solution {
    public boolean isPalindrome(int x) {
        int sum =0;
        int temp = x;
        if(x < 0) return false;
        while(temp != 0){
            int n = temp % 10;
            sum = sum*10 + n;
            temp = temp/10;
        }
        if(x != sum ){
            return false;
        }
        return true;
    }
}