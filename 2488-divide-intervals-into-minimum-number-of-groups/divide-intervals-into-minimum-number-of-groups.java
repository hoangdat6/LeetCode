class Solution {
    public int minGroups(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
      
        PriorityQueue<Integer> endTimeQueue = new PriorityQueue<>();
      
        for (int[] interval : intervals) {
            if (!endTimeQueue.isEmpty() && endTimeQueue.peek() < interval[0]) {
                endTimeQueue.poll();
            }
          
            endTimeQueue.offer(interval[1]);
        }
      
        return endTimeQueue.size();
    }
}