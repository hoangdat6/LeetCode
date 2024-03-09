class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        int re = -1;
        int n1 = nums1.length, n2 = nums2.length;
        int i1 = 0, i2 = 0;

        while(i1 < n1 && i2 < n2){
            if(nums1[i1] == nums2[i2]) return nums1[i1];
            if(nums1[i1] < nums2[i2]){
                i1++;
            }else {
                i2++;
            }
        }

        return re;
    }
}