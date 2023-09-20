class Solution {
    public int romanToInt(String s) {
        int res = 0;
         s = s.replace("IV", "IIII");
         s = s.replace("IX", "VIIII");
         s = s.replace("XL", "XXXX");
         s = s.replace("XC", "LXXXX");
         s = s.replace("CD", "CCCC");
         s = s.replace("CM", "DCCCC");
        for(int i = 0 ; i < s.length() ; i++)
        {
            if(s.charAt(i) == 'I') res += 1;
            else if(s.charAt(i) == 'V') res += 5;
            else if(s.charAt(i) == 'X') res += 10;
            else if(s.charAt(i) == 'L') res += 50;
            else if(s.charAt(i) == 'C') res += 100;
            else if(s.charAt(i) == 'D') res += 500;
            else if(s.charAt(i) == 'M') res += 1000;

        }

        return res;
    }
}
