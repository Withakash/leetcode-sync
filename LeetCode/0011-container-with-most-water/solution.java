class Solution {
    public int maxArea(int[] height) {
        int mArea = 0;
        int l = height.length;
        for(int i = 0,j = l-1 ; i < j ;){
            int cArea = (j-i) * Math.min(height[i],height[j]);
            if(cArea > mArea) mArea = cArea;

            if(height[i] > height[j]) j--;
            else i++;
        }
        return mArea;
    }
}
