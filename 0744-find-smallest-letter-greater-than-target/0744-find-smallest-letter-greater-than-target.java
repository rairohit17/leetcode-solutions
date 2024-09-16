class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int start=0;
        int end=letters.length-1;
        int mid=0;
        int ans=0;
        while ( start<=end){
            mid= start+(end-start)/2;
            if ( letters[mid]>target){
                end=mid-1;
                ans=mid;
            }
            else {
                start=mid+1;
            }


        }
        return letters[ans];
        
    }
}