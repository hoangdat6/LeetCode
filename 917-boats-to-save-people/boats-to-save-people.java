class Solution {
    public int numRescueBoats(int[] p, int limit) {
        int re = 0;
        
        int[] buckets = new int[limit + 1];

        for(int i : p){
            buckets[i]++;
        }

        int left = 0, right = limit;

        while(left <= right){
            while(left <= right && buckets[left] <= 0) left++;
            while(left <= right && buckets[right] <= 0) right--;

            if(buckets[left] <= 0 && buckets[right] <= 0) break;
            re++;

            if(left + right <= limit){
                buckets[left]--;
            }
            buckets[right]--;

        }

        return re;
    }
}