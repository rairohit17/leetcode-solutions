class Solution {
    public int[] buildArray(int[] nums) {
        int[] newArr= new int[ nums.length];
        int i=0;
        while (i< nums.length){
            newArr[i]=nums[nums[i]];
            i++;

        }
        return newArr;
        
    }
}