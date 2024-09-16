class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int start=0;
        int end= arr.length-1;
        int mid=0;
        int ans=0;
        // int  p=0;
        // int r=0;
        while( start<=end ){
            mid= start+(end-start)/2;
            if ( arr[mid]>arr[mid+1]){
                ans=mid;
                end=mid-1;
            }
            else if ( arr[mid]<arr[mid+1]){
                ans=mid+1;
                start=mid+1;
            }
            // if ( p==start&& r==end){
            //     break;
            // }
            // p=start;r=end;
      }
        return ans;
        
    }
}