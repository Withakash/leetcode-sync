class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n = nums2.length;
        int[] nge = new int[n];

        Stack<Integer> stack = new Stack<>();
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = n - 1; i >= 0; i--) {

            while (!stack.isEmpty() && stack.peek() <= nums2[i]) {
                stack.pop();
            }

            nge[i] = stack.isEmpty() ? -1 : stack.peek();
            stack.push(nums2[i]);
        }

        for (int i = 0; i < n; i++) {
            map.put(nums2[i], nge[i]);
        }

        int[] result = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            result[i] = map.get(nums1[i]);  // SAFE now
        }

        return result;
    }
}
