//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    
	public static void main (String[] args)throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while(t-->0)
		{
		    String str = br.readLine();
		    String s1 = str.split(" ")[0];
		    String s2 = str.split(" ")[1];
		    
		    Solution obj = new Solution();
		    
		    if(obj.isAnagram(s1,s2))
		    {
		        System.out.println("YES");
		    }
		    else
		    {
		         System.out.println("NO");
		    }
		    
		    
		    
		}
	}
}
// } Driver Code Ends


class Solution
{    
    //Function is to check whether two strings are anagram of each other or not.
    public static boolean isAnagram(String a,String b)
    {
        
        // Your code here
        HashMap<Character,Integer> hmap = new HashMap<>();
        
        for(int i=0;i<a.length();i++){
            char ch = a.charAt(i);
            if(hmap.containsKey(ch)){
                hmap.put(ch,hmap.get(ch) +1);
            }else{
                hmap.put(ch,1);
            }
        }
        
        for(int i=0;i<b.length();i++){
            char ch2 = b.charAt(i);
            if(hmap.containsKey(ch2)){
                if(hmap.get(ch2) ==1){
                    hmap.remove(ch2);
                }else{
                    hmap.put(ch2,hmap.get(ch2)-1);
                }
            }else{
                return false;
            }
        }
        if(hmap.size() >0){
            return false;
        }
        return true;
    }
}