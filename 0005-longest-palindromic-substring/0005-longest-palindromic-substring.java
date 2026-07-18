class Solution {
    public String longestPalindrome(String s) {
        int maxLen = 0;
        String ans = "";
        for (int i = 0; i < s.length(); i++) {
            for (int j = s.length() - 1; j >= i; j--) {
                if (s.charAt(i) == s.charAt(j)) {
                    int left = i;
                    int right = j;
                    while (left < right && s.charAt(left) == s.charAt(right)) {
                        left++;
                        right--;
                    }
                    if (left >= right) {
                        int len = j - i + 1;

                        if (len > maxLen) {
                            maxLen = len;
                            ans = s.substring(i, j + 1);
                        }
                        break;
                    }
                }
            }
        }

        return ans;
    }
}