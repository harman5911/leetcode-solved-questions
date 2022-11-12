class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        // BINARY SEARCH
        /*
        int left =0;
        int right = arr.length - 1;
        
        while(left < right){
            int mid = left + (right - left)/2;
            if(arr[mid] < arr[mid+1]){
                left = mid + 1;
            }else{
                right = mid;
            }
        }
        return right;
        */
        
        // SECOND METHOD
        for(int i=1;i<arr.length;i++){
            if(arr[i-1] < arr[i]  && arr[i] > arr[i+1]){
                return i;
            }
        }
        return 0;
    }
}