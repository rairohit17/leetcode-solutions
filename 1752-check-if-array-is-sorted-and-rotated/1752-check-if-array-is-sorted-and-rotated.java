class Solution {
    public boolean check(int[] nums) {
        int i=0;
        int rotation=0;
        
        while ( i<(nums.length-1)){           // approach  
                                                // find the number of rotarions made just by checking if num[i]>num[i+1]
                                                // if rotations>=2 return flase and if rotations==1 and fist < last return false 
                                                // else return true;


            if ( nums[i]< nums[ i+1]){
                i++;
            }
            else if ( nums[i]>nums[i+1]){
                i++;
                rotation++;
            }
            else{
                i++;
            }
        }
        if ( rotation==1){
            if(nums[0]<nums[nums.length-1]){
                return false;
            }
            
        }
        else if ( rotation>=2){
            return false;
        }
        return true;

        
        
        
    }
}