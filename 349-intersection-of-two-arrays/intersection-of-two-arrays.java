class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Map<Integer,Integer> m1 = new HashMap<>();
        Map<Integer,Integer> m2 = new HashMap<>();

        for(int i = 0; i < nums1.length; ++i){
            m1.put(nums1[i], m1.getOrDefault(nums1[i], 0) + 1);
        }
        for(int i = 0; i < nums2.length; ++i){
            m2.put(nums2[i], m2.getOrDefault(nums2[i], 0) + 1);
        }
        
        List<Integer> list = new ArrayList<>();
        for(var m : m1.entrySet()){
            if(m2.get(m.getKey()) != null && m2.get(m.getKey()) > 0){
                list.add(m.getKey());
            }
        }
        int[] re = new int[list.size()];
        for(int i = 0; i < list.size(); ++i){
            re[i] = list.get(i);
        }

        return re;
    }
}