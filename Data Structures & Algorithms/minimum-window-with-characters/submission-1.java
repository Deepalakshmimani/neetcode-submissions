class Solution {

    public static boolean equals(int[] freq1, int[] freq2) {
        for (int i = 0; i < 128; i++) {
            if (freq1[i] > freq2[i]) {
                return false;
            }
        }
        return true;
    }

    public String minWindow(String s, String t) {

        int n1 = s.length();
        int n2 = t.length();

        if (n1 < n2) return "";

        int[] freq1 = new int[128];
        int[] freq2 = new int[128];

        for (char ch : t.toCharArray()) {
            freq1[ch]++;
        }

        int right = 0;
        int minLen = Integer.MAX_VALUE;
        String ans = "";

        for (int left = 0; left < n1; left++) {

            // Expand until window becomes valid
            while (right < n1 && !equals(freq1, freq2)) {
                freq2[s.charAt(right)]++;
                right++;
            }

            // Window is valid
            if (equals(freq1, freq2)) {

                int currLen = right - left; // right is exclusive

                if (currLen < minLen) {
                    minLen = currLen;
                    ans = s.substring(left, right);
                }
            }

            // Remove left character before moving left forward
            freq2[s.charAt(left)]--;
        }

        return ans;
    }
}