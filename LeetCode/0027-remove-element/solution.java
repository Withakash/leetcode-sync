import java.util.*;
class Solution {
    public int removeElement(int[] nums, int val) {
      Vector<Integer> v = new Vector<Integer>();
      for(int a : nums){
          if(a != val)
            v.add(a);
      }
         
         int i = 0;
         for(int a : v)
             nums[i++] = a;

             return v.size();
    }
   
}
