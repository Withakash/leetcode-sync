class Solution {
    public boolean isPowerOfFour(int n) {
        if(n <= 0) return false;

        int one = 0;
        int zero = 0;

        while(n != 0){
            
            if((n & 1) == 1){
                one++;
            } else {
                zero++;
            }

            n = n >>> 1;
        }

        return one == 1 && zero % 2 == 0;
    }
}
