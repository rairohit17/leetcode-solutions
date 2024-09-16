import java.util.Arrays;
import java.util.ArrayList;
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
         ArrayList<Integer> list = new ArrayList<>();
        
        int[] latest=new int[1001];
        for( int i=0;i<nums1.length;i++){
            latest[nums1[i]]=1;
        }
        
        for ( int j=0;j<nums2.length;j++ ){
            if (latest[nums2[j]]==1){
                list.add(nums2[j]);
                latest[nums2[j]]=0;

            }
        }
        int[] arr=new int[list.size()];
        for ( int k=0;k<list.size();k++){
            arr[k]=list.get(k);

        }
        return arr;

    }
    }