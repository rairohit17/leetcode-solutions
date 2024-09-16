class Solution {
    public void moveZeroes(int[] nums) {
        int marked =0;
        int i=0;
        int target;
        while( i<nums.length){
            if ( nums[i]!=0){
                target= nums[i];
                nums[i]=0;
                nums[marked]=target;
                marked++;
                i++;
            }
            else if ( nums[i]==0){
                i++;
            }
        }
        
    }
}