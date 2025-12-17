class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] arr) {
        int n = arr.length;
        int[] nge = new int[n];
        Stack<Integer> st = new Stack<>();
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i = n-1; i>=0 ; i--)
        {
            while(!st.isEmpty() && st.peek() <= arr[i])
            {
                st.pop();
            }

            if(st.isEmpty()) nge[i] =-1;
            else nge[i] = st.peek();

            st.push(arr[i]);
        }

        for(int i =0 ; i < arr.length ; i++)
        {
            map.put(arr[i] , nge[i]);
        }

        int[] res = new int[nums1.length];
        for(int i = 0 ; i<nums1.length ;i++)
        {
            res[i] = map.get(nums1[i]);
        }
        
        return res ;
    }
}
