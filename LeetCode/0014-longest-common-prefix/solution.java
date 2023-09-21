class Solution {
    public String longestCommonPrefix(String[] strs) {

        Arrays.sort(strs);
        int size = strs.length;
        int l = strs[0].length();
        String pre = strs[0];
        if(size==0) return "";
        if(size==1) return pre;
        String str = "";
        char cc;
      out:  for(int i = 0 ; i < l ; i++)
          {
           cc = pre.charAt(i);
            for(int j = 1 ; j < strs.length && i < strs[j].length() ; j++)
                if(cc != strs[j].charAt(i))
                     break out;  
             str+=cc;
        }

        return str;
    }
}
