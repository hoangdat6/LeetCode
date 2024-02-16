class Solution {
    public int findLeastNumOfUniqueInts(int[] arr, int k) {
        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < arr.length; ++i){
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        int re = map.size();

        int[] count = new int[100000];

        for(var entry : map.entrySet()){
            count[entry.getValue()] ++;
        }

        for(int i = 0; i < 100000; ++i){
            if(count[i] != 0){
                int remove = k / i;
                if(remove == 0){
                    break;
                }else{
                    remove = Math.min(remove, count[i]);
                    re -= remove;
                    k -= remove * i;
                }
            }
        }

        return re;
    }
}