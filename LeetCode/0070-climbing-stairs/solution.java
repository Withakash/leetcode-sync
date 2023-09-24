class Solution {
    public int climbStairs(int n) {
        return getFibbonaci(n);
    }

    static int getFibbonaci(int num)
    {
        int x = 0 ;
        int y = 1 ;
        for(int i = 1 ; i <= num ; i++)
        {
           y = x + y ;
           x = y - x;
          
        }
        return y;
    }
}
