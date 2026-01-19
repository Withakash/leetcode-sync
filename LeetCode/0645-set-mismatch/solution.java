class Solution {
    public int[] findErrorNums(int[] nums) {
      int l = nums.length;
      int ans=0,sum=0,sumofn = (l*(l+1))/2;
      HashSet<Integer> hs = new HashSet<>();
      int[] res = new int[2];
      for(int x : nums) 
      {
         sum+=x;
         hs.add(x);
      }
      for(int i:hs) {
        ans+=i;
      }

  
     res[0] = sum - ans;
     res[1] = sumofn - ans;
     return res;
    }
}
