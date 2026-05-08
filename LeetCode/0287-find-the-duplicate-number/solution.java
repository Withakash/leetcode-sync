class Solution {
    public int findDuplicate(int[] nums) {
        boolean[] flag = new boolean[nums.length];

        for(int i = 0 ; i < nums.length ; i++){
            if(flag[nums[i]]){
                return nums[i];
            }
            else{
                flag[nums[i]] = true;
            }
        }

        return -1;
    }
}
