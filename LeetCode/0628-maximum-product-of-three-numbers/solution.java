class Solution {
    public int maximumProduct(int[] nums) {
        // HashSet<Integer> hs = new HashSet<>();
        PriorityQueue<Integer> pq1 = new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> pq2 = new PriorityQueue<>();
        for(int n : nums) {
           pq1.add(n);
           pq2.add(n);
    }

        System.out.println(pq1);
        System.out.println(pq2);
        int a = pq1.poll();
        int b = pq1.poll();
        int c = pq1.poll();

        int x = pq2.poll();
        int y = pq2.poll();
        return Math.max(a*b*c , x*y*a);
    }
}
