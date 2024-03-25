class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        int[] cnt = new int[nums.length + 1];

        List<Integer> re = new ArrayList<>();
        for(int i = 0; i < nums.length; ++i){
            cnt[nums[i]]++;

            if(cnt[nums[i]] == 2){
                re.add(nums[i]);
            }
        }

        return re;
    }
}