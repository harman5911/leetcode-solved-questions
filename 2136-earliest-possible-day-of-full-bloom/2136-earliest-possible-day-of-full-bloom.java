class Solution{
    public int earliestFullBloom(int[] plantTime,int[] growTime){
        int n = plantTime.length;
        int [][] a = new int[n][2];
        for(int i=0;i<n;i++){
            a[i][0] = plantTime[i];
            a[i][1] = growTime[i];
        }
        
        Arrays.sort(a,(b,c) -> (c[1]-b[1]));
        
        int ans =0;
        int worked_day = 0;
        for(int i=0;i<n;i++){
            worked_day+= a[i][0];
            ans = Math.max(ans,worked_day+a[i][1]);
        }
        return ans;
    }
}