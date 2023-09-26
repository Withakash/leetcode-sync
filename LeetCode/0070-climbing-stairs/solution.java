class Solution {
    public int climbStairs(int n) {
                int x = 0 ;
        int y = 1 ;
        for(int i = 1 ; i <= n ; i++)
        {
           y = x + y ;
           x = y - x;
          
        }
        return y;
    }


}
