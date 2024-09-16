class Solution {
    public void sortColors(int[] nums) {
        int[] storage= {0,0,0};
        for ( int i=0;i <nums.length ; i++){
            if ( nums[i]==0){
                storage[0]+=1;
            }
             else if ( nums[i]==1){
                storage[1]+=1;
            }
            else if ( nums[i]==2){
                storage[2]+=1;
            }
        }
        for (int j=0;j<storage[0];j++){
            nums[j]=0;
        }
        for (int k=storage[0];k<(storage[0]+storage[1]);k++){
            nums[k]=1;
        }
        for (int l=storage[0]+ storage[1];l<nums.length;l++){
            nums[l]=2;
        }
        

    }
}