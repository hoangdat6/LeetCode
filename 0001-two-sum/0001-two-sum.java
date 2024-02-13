class Solution {
    public int[] twoSum(int[] arr, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int check = target - arr[i];
            if (map.containsKey(check)) {
                return new int[] { i, map.get(check) };
            }
            map.put(arr[i], i);
        }
        return new int[] {};
    }
}