class Solution {
    public int removeDuplicates(int[] nums) {
        LinkedHashSet<Integer> s  ;
        s = new LinkedHashSet<Integer> ();
        for(int i : nums)
            s.add(i);
         int i = 0;
         for(int a : s)
             nums[i++] = a;

         return s.size();
  
    }
}
