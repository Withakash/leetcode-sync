class Solution {
    public boolean isHappy(int num) {
        if(num == 1) return true;
        else if(num == 4) return false;
        else {
         int res = 0;
        while(num != 0){
            res+=(num%10)*(num%10);
            num/=10;
        }
        return isHappy(res);
        }
    }
}
