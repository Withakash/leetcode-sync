class Solution {
    public int thirdMax(int[] nums) {
      Set<Integer> set = new HashSet<>();
      PriorityQueue<Integer> pq = new PriorityQueue<>();  

      for(int num : nums){
        set.add(num);
      }
      
      for(int x : set){
        pq.add(x);

        if(pq.size() > 3) pq.poll();
      }

      if(pq.size() < 3){
        while(pq.size() > 1){
            pq.poll();
        }
      }

      System.out.println(pq);
      return pq.peek();
    }
}
