class Solution {
    public int[] searchRange(int[] nums, int target) {
       int[] arr= new int[2];
       arr[0]= lowerBound(nums,target);
       arr[1]= upperBound(nums,target);
       return arr;
    }
    int upperBound( int[] arr, int target){
        int start=0;
        int end=arr.length-1;
        int mid=0;
        int upperValue=-1;
        while ( start<=end ){
            mid= start + (end-start)/2;
            if (arr[mid]<target ){
                start=mid+1;

            }
            else if ( arr[mid]==target){
                upperValue=mid;
                start=mid+1;
            }
            else {
                end=mid-1;

            }
        }
        return upperValue;

    }
    int lowerBound( int[] arr, int target){
        int start=0;
        int end=arr.length-1;
        int mid=0;
        int lowerValue=-1;
        while ( start<=end ){
            mid= start + (end-start)/2;
            if (arr[mid]<target ){
                start=mid+1;

            }
            else if ( arr[mid]==target){
                lowerValue=mid;
                end=mid-1;
            }
            else {
                end=mid-1;

            }
        }
        return lowerValue;

    }

}