class Solution {
    public int findPeakElement(int[] nums) {
        int start=0;
        int end=nums.length-1;
        int mid=0;
        int ans=nums.length-1;
        int p=0;
        int m=0;
        while (start<=end){
            mid=start+(end-start)/2;
            if (  mid<end&& nums[mid]>nums[mid+1]){
                end=mid;
                ans=mid;

            }
            else if(mid<end && nums[mid]<nums[mid+1]) {
                start=mid+1;
                ans=mid+1;
            }
            if ( p==start && m==end){
                break;
            }
            p=start;
            m=end;

        }
        return ans;
      
    }
}