class Solution {
    public int numIdenticalPairs(int[] nums) {
        int pairs=0;
        int i=0;
        
        while ( i< nums.length){
            for ( int j=i+1;j<nums.length;j++){
                 if ( nums[i]==nums[j]){
                pairs+=1;

            } 
            }
            i++;

        }
        return pairs;
        
    }
}