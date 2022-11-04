class Solution {
    public int countSubstrings(String s) {
        
        int n = s.length();
        int res =0;
        
        for(int i=0;i<n;i++){
        res += findP(s,i,i,n);
        res += findP(s,i,i+1,n);
        }
        return res;
    } 
    public int findP(String s,int l,int r,int n){
        int count =0;
        
        
        while(l>=0 && r<n){
            if(s.charAt(l) == s.charAt(r)){
                l--;
                r++;
                count++;
            }else{
                break;
            }
        }
        return count;
    }
}

