class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
       int max = 0 ;
       int count = 0;
       for(int i = 0 ; i < nums.length ; i++) {
           if(count > max) 
             max = count;
           if(nums[i] == 1) ++count;
           else count = 0;
           
     }
             if(count > max) 
             max = count;
    //  if(nums[nums.length-1] == 1) max++;
   
       return max;
    }
}
