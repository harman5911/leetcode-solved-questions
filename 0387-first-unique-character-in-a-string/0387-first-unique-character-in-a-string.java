class Solution {
    public int firstUniqChar(String s) {
        int n = s.length();
        int count[] = new int[26];
        for(char c: s.toCharArray()){
            count[c - 'a'] += 1;
        }
        for(int i=0;i<n;i++){
            if(count[s.charAt(i) - 'a'] == 1){
                return i;
            }
        }
        return -1;
    }
}