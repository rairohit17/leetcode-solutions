class Solution {
    public int singleNumber(int[] nums) {
        int len=6*(int)Math.pow(10,4)+1;
        int[] arr= new int[len];
        for ( int i=0;i<len-1;i++){
            arr[i]=0;
        }
        for ( int i=0;i<nums.length;i++){
            if ( arr[nums[i]+(3*(int)Math.pow(10,4))]==0){
                arr[nums[i]+(3*(int)Math.pow(10,4))]=1;
            }
            else{
                arr[nums[i]+(3*(int)Math.pow(10,4))]=0;

            }
        }
        int j=0;
        while( j<nums.length){
            if ( arr[nums[j]+(3*(int)Math.pow(10,4))]==1){
                return nums[j];

            }
            j++;
        }
        return -1;
        
    }
}
