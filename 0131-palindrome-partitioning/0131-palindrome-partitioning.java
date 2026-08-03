class Solution {

    List<List<String>> ans = new ArrayList<>();

    public List<List<String>> partition(String s) {
        backtrack(0, s, new ArrayList<>());
        return ans;
    }

    private void backtrack(int start, String s, List<String> path) {
        if (start == s.length()) {
            ans.add(new ArrayList<>(path));
            return;
        }
        for (int end = start; end < s.length(); end++) {

            if (isPalindrome(s, start, end)) {
                path.add(s.substring(start, end + 1));
                backtrack(end + 1, s, path);
                path.remove(path.size() - 1);
            }
        }
    }
    private boolean isPalindrome(String s, int left, int right) {

        while (left < right) {

            if (s.charAt(left) != s.charAt(right))
                return false;

            left++;
            right--;
        }
        return true;
    }
}