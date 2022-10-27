class Solution {
    int found;
    private int NoDuplicate(String s){
        for(int i=0;i<s.length();i++){
            int pos = s.charAt(i)-'a';
            if(((1<<pos)&found)>0){
                return 0;
            }
            found += (1<<pos);
        }
        return 1;
    }
    public int maxLength(List<String> arr) {
        int ans = 0,n = arr.size();
        for(int mask=0;mask<(1<<n);mask++){
            found = 0;
            int len = 0,ok = 1;
            for(int i=0;i<n&&(ok>0);i++){
                if(((1<<i)&mask)>0){
                    if(NoDuplicate(arr.get(i))==0){
                        ok = 0;
                        break;
                    }
                    else{
                        len += arr.get(i).length();
                    }
                }
            }
            if(ok==1){
                ans = Math.max(ans,len);
            }
        }
        return ans;
    }
}