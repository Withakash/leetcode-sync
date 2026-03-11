class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> hs = new HashSet<>();
        for(int x : nums) {
            if(hs.add(x) == false) return true;
        }
        return false;
    }
}
