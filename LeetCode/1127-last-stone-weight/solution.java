class Solution {
    public int lastStoneWeight(int[] stones) {
          // Max Heap
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b - a);

        // add all stones
        for (int s : stones) {
            pq.add(s);
        }

        // process until one or none left
        while (pq.size() > 1) {
            int y = pq.poll(); // largest
            int x = pq.poll(); // second largest

            if (y != x) {
                pq.add(y - x);
            }
        }

        return pq.isEmpty() ? 0 : pq.peek();
    }
}
