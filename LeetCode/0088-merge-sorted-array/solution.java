class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        List s = new ArrayList();
        for(int i = 0 ; i < m ; i++)
        {
          s.add(nums1[i]);
        }
        for(int y : nums2)
        {
          s.add(y);
        }
        Collections.sort(s);
        int k = 0;
        for(Object x : s)
        {
           nums1[k++] = (Integer)x;
        }
    }
}
