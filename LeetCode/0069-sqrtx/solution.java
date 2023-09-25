class Solution {
    public int mySqrt(int x) {
        long i;
       for( i = 0 ; true ; i++ )
       {
          if(i*i <= x && (i+1)*(i+1) > x)
          {
              break;
          }
       } 
       return (int)i;
    }
}
