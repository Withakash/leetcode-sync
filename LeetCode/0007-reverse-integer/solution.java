class Solution {
    public int reverse(int x) {
        boolean isnegative=false;
        if(x<0){
            isnegative=true;
            x=-x;
        }
        long reverse = 0;
        while(x>0)
        {
            reverse = reverse * 10 + x % 10;
            x=x/10;
        }
        if(reverse > Integer.MAX_VALUE){
              return 0;
        }
      

        return (int)(isnegative ? -reverse : reverse);
    }
}
