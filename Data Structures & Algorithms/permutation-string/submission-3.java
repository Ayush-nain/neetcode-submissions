class Solution {
    public boolean checkInclusion(String s1, String s2) {

        if (s1.length() > s2.length()) {
            return false;
        }

        int[] need = new int[26];
        int[] window = new int[26];

        // Frequency of s1
        for (int i = 0; i < s1.length(); i++) {
            need[s1.charAt(i) - 'a']++;
            window[s2.charAt(i) - 'a']++;
        }

        // Check first window
        if (Arrays.equals(need, window)) {
            return true;
        }

        int left = 0;

        // Slide the window
        for (int right = s1.length(); right < s2.length(); right++) {

            // Add new character
            window[s2.charAt(right) - 'a']++;

            // Remove left character
            window[s2.charAt(left) - 'a']--;

            left++;

            // Compare frequencies
            if (Arrays.equals(need, window)) {
                return true;
            }
        }

        return false;
    }
}