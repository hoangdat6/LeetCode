class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> map = new HashMap();

        for(int a : arr){
            map.put(a, map.getOrDefault(a, 0) + 1);
        }

        Set<Integer> set = new HashSet();
        for(var m : map.entrySet()){
            set.add(m.getValue());
        }

        if(set.size() < map.size()){
            return false;
        }
        return true;
    }
}