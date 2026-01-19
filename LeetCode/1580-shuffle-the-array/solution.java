class Solution {
    public int[] shuffle(int[] nums, int n) {
        int x,y, l = nums.length;
        int[] arr = new int[l];
      for(int i = 0,j=0 ; j < n ; i = i+2, j++) {
        arr[i] = nums[j];
      }
      for(int i = 1,j = n ; j < l ; i = i+2, j++) {
        arr[i] = nums[j];
      }
      return arr;
    }
}
