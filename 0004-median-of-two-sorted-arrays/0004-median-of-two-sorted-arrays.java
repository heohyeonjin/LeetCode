import java.util.*;
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int mergedLen = nums1.length+nums2.length;
        int mergedArr[] = new int[mergedLen];

        for(int i=0;i<nums1.length;i++){
            mergedArr[i] = nums1[i];
        }
        for(int i=nums1.length;i<mergedLen;i++){
            mergedArr[i] = nums2[i-nums1.length];
        }
        Arrays.sort(mergedArr);
        if(mergedLen%2==1){
            int medianIdx = (mergedLen)/2;
            return mergedArr[medianIdx];
        }
        else{
            int medianIdx1 = mergedLen/2;
            int medianIdx2 = mergedLen/2-1;
            return (mergedArr[medianIdx1]+mergedArr[medianIdx2])/2.0;
        }
    }

}