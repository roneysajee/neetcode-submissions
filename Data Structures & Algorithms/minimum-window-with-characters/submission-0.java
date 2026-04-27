class Solution {
    public String minWindow(String s, String t) {
        if (s.length() < t.length()) return "";

        int[] targetArr = new int[58]; // Covers A-z
        int[] windowArr = new int[58];
        for (char c : t.toCharArray()) targetArr[c - 'A']++;

        int required = 0;
        for (int count : targetArr) if (count > 0) required++;

        int l = 0, r = 0, formed = 0;
        int minLen = Integer.MAX_VALUE;
        int startIdx = 0;

        while (r < s.length()) {
            char c = s.charAt(r);
            int idx = c - 'A';
            windowArr[idx]++;

            if (targetArr[idx] > 0 && windowArr[idx] == targetArr[idx]) {
                formed++;
            }

            // Try to shrink the window
            while (formed == required) {
                if (r - l + 1 < minLen) {
                    minLen = r - l + 1;
                    startIdx = l;
                }

                char leftChar = s.charAt(l);
                int leftIdx = leftChar - 'A';
                windowArr[leftIdx]--;
                
                if (targetArr[leftIdx] > 0 && windowArr[leftIdx] < targetArr[leftIdx]) {
                    formed--;
                }
                l++;
            }
            r++;
        }

        return minLen == Integer.MAX_VALUE ? "" : s.substring(startIdx, startIdx + minLen);
    }
}