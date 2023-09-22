class Solution {
    public int lengthOfLastWord(String s) {
       s  = s.trim();
       int x = s.lastIndexOf(" ");
       x = s.length()-x;
       return x-1;
    }
}
