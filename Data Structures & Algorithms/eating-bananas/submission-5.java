class Solution {
    public int minEatingSpeed(int[] piles, int h) {

        int low = 1;
        int high = 0;

        // Maximum pile is the maximum possible speed
        for (int pile : piles) {
            high = Math.max(high, pile);
        }

        int ans = high;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            long hours = 0;

            for (int pile : piles) {
                hours += (pile + mid - 1) / mid;
            }

            if (hours <= h) {
                // mid works, try a smaller speed
                ans = mid;
                high = mid - 1;
            } else {
                // mid is too slow
                low = mid + 1;
            }
        }

        return ans;
    }
}