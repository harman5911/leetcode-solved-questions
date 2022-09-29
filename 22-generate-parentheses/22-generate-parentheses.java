class Solution {
    List<String> result = new ArrayList<>();
    public List<String> generateParenthesis(int n) {
        generateValue(result,0,0,n,"");
        return result;
    }
    public void generateValue(List<String> result,int open ,int close,int n , String str){
        if(str.length() == 2*n){
            result.add(str);
            return;
        }
        if(open < n){
            generateValue(result,open+1,close,n,str+"(");
        }
        if(close<open){
            generateValue(result,open,close+1,n,str+")");
        }
    }
}