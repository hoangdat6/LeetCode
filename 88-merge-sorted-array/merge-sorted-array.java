class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int k = m + n;
        int[] re = new int[k];

        int i = 0;
        int j = 0;
        int index = 0;
        while(i < m && j < n){
            if(nums1[i] < nums2[j]){
                re[index] = nums1[i];
                ++i;
            }else {
                re[index] = nums2[j];
                ++j;
            }
            ++index;
        }

        while(i < m){
            re[index++] = nums1[i++]; 
        }

        while(j < n){
            re[index++] = nums2[j++];
        }

        for(int h = 0;h < k; ++h){
            nums1[h] = re[h];
        }
    }
}