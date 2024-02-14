class Solution {
    public int[] rearrangeArray(int[] nums) {
        List<Integer> positive = new ArrayList<>();
        List<Integer> negative = new ArrayList<>();
        List<Integer> relis = new ArrayList<>();
        int n = nums.length;

        int[] re = new int[n];
        for(int i = 0; i < n; ++i){
            if(nums[i] > 0){
                positive.add(nums[i]);
            }else{
                negative.add(nums[i]);
            }
        }

        for(int i = 0; i < n / 2; ++i){
            relis.add(positive.get(i));
            relis.add(negative.get(i));
        }

        for(int i = 0; i < n; ++i){
            re[i] = relis.get(i);
        }

        return re;
    }
}