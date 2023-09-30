class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
         s = s.replaceAll(" ", "");
         s = s.replaceAll("\\W", "");
         s = s.replaceAll("_", "");
        StringBuilder sb = new StringBuilder(s);
        sb = sb.reverse();

        return s.equals(sb+"");

    }
}
