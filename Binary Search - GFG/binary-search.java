//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

  public class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            int key = sc.nextInt();
            Solution g = new Solution();
            System.out.println(g.binarysearch(arr, n, key));
            T--;
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    int binarysearch(int arr[], int n, int k) {
        // code here
        int N = arr.length;
        return search(arr,0,N-1,k);
    }
    public int search(int arr[],int left,int right,int x){
        while(left <= right){
            int mid = left + (right - left)/2;
            if(x == arr[mid])return mid;
            else if(x < arr[mid]) right=mid-1;
            // search(arr,left,mid-1,x);
            else
            left = mid+1;
            // return search(arr,mid+1,right,x);
        }
        return -1;
    }
        
    
}