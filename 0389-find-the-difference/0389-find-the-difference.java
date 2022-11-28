class Solution {
    public char findTheDifference(String s, String t) {
        int res = 0;
        /*
        // firstMethod
        for(int i=0 ; i<t.length();i++){
            res += t.charAt(i);
        }
        for(int i=0;i<s.length();i++){
            res -= s.charAt(i);
        }
        return (char) res;
        */
        
        // 2nd Method (XOR)
        for(int i=0 ; i<t.length();i++){
            res = res ^ t.charAt(i);
        }
        for(int i=0;i<s.length();i++){
            res = res ^ s.charAt(i);
        }
        return (char) res;
    }
}