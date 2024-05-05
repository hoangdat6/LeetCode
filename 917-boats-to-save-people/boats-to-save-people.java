class Solution {
    public int numRescueBoats(int[] p, int limit) {
        int re = 0;
        
        int[] buckets = new int[limit + 1];

        for(int i : p){
            buckets[i]++;
        }

        int left = 0, right = limit;

        while(left <= right){
            while(left < limit && buckets[left] == 0) left++;
            while(right > 0 && buckets[right] == 0) right--;

            if(left > right) break;
            if(left == right && buckets[left] == 1){
                re++; break;
            }

            if(left + right <= limit){
                buckets[left]--; buckets[right]--;
            }else{
                buckets[right]--;
            }

            re++;
        }

        return re;
    }
}