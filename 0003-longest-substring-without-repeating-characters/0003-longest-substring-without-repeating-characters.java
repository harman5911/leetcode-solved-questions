class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        int start =0;
        int end =0;
        int maxLength =0;

        Set<Character> st = new HashSet<>();
        while(end < s.length()){
            if(st.add(s.charAt(end))){
                end++;
                maxLength = Math.max(maxLength,st.size());
            }else{
                st.remove(s.charAt(start));
                start++;
            }
        }
        return maxLength;
    }
}