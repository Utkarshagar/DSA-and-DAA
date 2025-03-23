class Solution {
    public int[] nextGreaterElements(final int[] nums) {
        final int n = nums.length;
        final int[] res = new int[n];
        final Stack<Integer> stack = new Stack<>();

        Arrays.fill(res, -1);

        for(int i = 0; i < n * 2; ++i) {
            final int idx = i % n;

            while(!stack.isEmpty() && nums[stack.peek()] < nums[idx])
                res[stack.pop()] = nums[idx];

            stack.push(idx);
        }

        return res;
    }
}