class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n < 0) return false;
         int one = 0;
        while(n != 0 ){
            one = one + (n & 1);
            n = n >>> 1;
        }
        return one == 1;
    }
}
