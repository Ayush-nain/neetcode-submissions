class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {

        int n = nums.length;
        int[] ans = new int[n - k + 1];

        Deque<Integer> dq = new ArrayDeque<>();

        int r = 0;
        int index = 0;

        while (r < n) {

            // Remove elements outside the window
            while (!dq.isEmpty() && dq.peekFirst() <= r - k) {
                dq.pollFirst();
            }

            // Remove smaller elements from the back
            while (!dq.isEmpty() && nums[dq.peekLast()] <= nums[r]) {
                dq.pollLast();
            }

            // Add current index
            dq.offerLast(r);

            // Window is ready
            if (r >= k - 1) {
                ans[index] = nums[dq.peekFirst()];
                index++;
            }

            r++;
        }

        return ans;
    }
}