class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set li = new HashSet();
        for(int i : nums)
        {
            if(li.add(i) == false) return true;
        }
        return false;
    }
}
