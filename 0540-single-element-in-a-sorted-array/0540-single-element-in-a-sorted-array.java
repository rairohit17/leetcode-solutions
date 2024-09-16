class Solution {
    public int singleNonDuplicate(int[] nums) {
        int start=0;
        int end=nums.length-1;
        int mid=0;
        while ( start<=end){
            mid=(start+end)/2;
            int index= mid;
           if ( mid<nums.length-1&& nums[mid]==nums[mid+1]){
            if (mid%2==0){
                start=mid+2;
            }
            else{
                end=mid-1;
            }
           }
           else if ( mid>0&&nums[mid]==nums[mid-1]){
            if( mid%2==0){
                end=mid-2;
            }
            else{
                start=mid+1;
            }
           }
           else {
            return nums[mid];
           }
        }
        return -1;
        
    }
}