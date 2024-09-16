class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rows=matrix.length;
        int columns=matrix[0].length;
        int rStart=0;
        int rEnd=rows-1;
        int colStart=0;
        int colEnd=matrix[0].length-1;
        int colMid=(colStart+colEnd)/2;
        int p=0;
        int q=0;
        while ( rStart<=rEnd){
            int rMid=(rStart+rEnd)/2;
            if (matrix[rMid][colMid]==target ){
            return true;
        }
        if ( matrix[rMid][colMid]<target){
            rStart=rMid;
        }
        else if ( matrix[rMid][colMid]>target){
            rEnd=rMid;
        }
        if ( p==rStart&& q==rEnd){
            break;
        }
        p=rStart;q=rEnd;

    }
    boolean res=binarySearch(matrix[rStart],target);
    if ( res==true){
        return res;
    }
    else {
        return binarySearch(matrix[rEnd],target);
    }


    }
    boolean binarySearch(int[] nums,int target){
        int start=0;
        int end=nums.length-1;
        int mid=0;
        while ( start<=end){
            mid=start+(end-start)/2;
            if ( nums[mid]==target){
                return true;

            }
            else if ( nums[mid]<target){
                start=mid+1;

            }
            else{
                end=mid-1;
            }
        }
        return false;
    }
}