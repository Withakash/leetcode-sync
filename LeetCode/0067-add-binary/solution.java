class Solution {
    public String addBinary(String a, String b) {

        int len = Math.max(a.length(),b.length());
        int[] a1 = new int[len];
        int[] b1 = new int[len];
        StringBuilder str = new StringBuilder();
        int carry = 0;

        for(int i = a.length()-1 , j = 0 ; i >= 0 ; i--,j++ )
           a1[j] = Character.getNumericValue(a.charAt(i));

        for(int i = b.length()-1 , j = 0 ; i >= 0  ; i--,j++ )
           b1[j] = Character.getNumericValue(b.charAt(i));
      
        for(int i = 0 ; i < len ; i++)
        {
              if(a1[i] == 1 && b1[i] == 1){
                if(carry == 1){
                   str.append("1");
                }else{
                   str.append("0");
                   carry = 1;
                } 
            }else if((a1[i] == 1 && b1[i] == 0)||(a1[i] == 0 && b1[i] == 1) ){
                if(carry == 1){
                   str.append("0");
                   carry = 1; 
                }else{
                  str.append("1");
                } 
            }else if(a1[i] == 0 && b1[i] == 0){
                if(carry == 1){
                   str.append("1");
                   carry = 0;
                }else{
                    str.append("0");
                }   
            }
        }
        if(carry == 1) str.append("1");
        System.out.print(str.reverse());
        return str+"";
    }
}
