class Solution {
    public int maximumProduct(int[] nums) {
      PriorityQueue<Integer> pqMax = new PriorityQueue<>(Collections.reverseOrder());
      PriorityQueue<Integer> pqMin = new PriorityQueue<>();

      for(int x : nums) {
        pqMax.add(x);
        pqMin.add(x);
       }

        int a = pqMax.poll();
        int b = pqMax.poll();
        int c = pqMax.poll();

        int x = pqMin.poll();
        int y = pqMin.poll();

        
        // System.out.println(pq);
        return Math.max(a*b*c , a*x*y);
    }
}
