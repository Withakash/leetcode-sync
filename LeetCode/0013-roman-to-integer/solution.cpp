class Solution {
public:
    int romanToInt(string s) {
        int num=0,next=0,ans=0;
        int l=s.length();
        while(l--)
        {
            switch(s[l])
            {
               case 'M': num=1000;
               break;
               case 'D': num=500;
               break;
               case 'C': num=100;
               break;
               case 'L': num=50;
               break;
               case 'X': num=10;
               break;
               case 'V': num=5;
               break;
               case 'I': num=1;
               break;
            }  

            if(num>=next)
            {
                ans+=num;
            }
            else 
            {
                ans-=num;
            } 
            
            next=num;
        }
        return ans;
    }    
          
};
