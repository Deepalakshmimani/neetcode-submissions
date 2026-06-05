class Solution {

    public static boolean Equals(int[] arr1, int[] arr2) {
        for(int i = 0; i < 128; i++) {
            if(arr1[i] > arr2[i]) {
                return false;
            }
        }
        return true;
    }

    public String minWindow(String s, String t) {

        int[] freq1 = new int[128];
        int[] freq2 = new int[128];

        String ans = "";
        int len = Integer.MAX_VALUE;

        int n1 = s.length();
        int n2 = t.length();

        if(n1 < n2) return "";

        for(char ch : t.toCharArray()) {
            freq1[ch]++;
        }

        int right = 0;

        for(int left = 0; left < n1; left++) {

            while(right < n1 && !Equals(freq1, freq2)) {
                char ch = s.charAt(right);
                freq2[ch]++;
                right++;
            }

            if(Equals(freq1, freq2)) {

                int currLen = right - left;

                if(currLen < len) {
                    len = currLen;
                    ans = s.substring(left, right);
                }
            }

            char ch = s.charAt(left);
            freq2[ch]--;
        }

        return ans;
    }
}