//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String s = read.readLine();
            
            Solution ob = new Solution();
            String result = ob.removeDups(s);
            
            System.out.println(result);
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {

    String removeDups(String S) {

        // code here
        /*

        String s1="";

        HashSet<Character> c=new HashSet<>();

        for(int i=0;i<S.length();i++)

        {

          if(!c.contains(S.charAt(i)))

          {

              c.add(S.charAt(i));

              s1+=S.charAt(i);

          }

        }

        return s1;
        */
        
        HashMap<Character,Integer> hmap = new HashMap<>();
        String ans = "";
        for(int i=0;i<S.length();i++){
            char ch = S.charAt(i);
            if(hmap.containsKey(ch)){
                hmap.put(ch,hmap.get(ch)+1);
            }else{
                hmap.put(ch,1);
                ans += ch;
            }
        }
        return ans;
    }

}