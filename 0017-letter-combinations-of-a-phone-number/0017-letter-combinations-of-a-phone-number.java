import java.util.*;

class Solution {

    Map<Character, String> map = new HashMap<>();

    public List<String> letterCombinations(String digits) {

        List<String> res = new ArrayList<>();

        if (digits == null || digits.length() == 0) {
            return res;
        }
        String[] values = {
            "abc", "def", "ghi", "jkl",
            "mno", "pqrs", "tuv", "wxyz"
        };
        for (int i = 0; i < values.length; i++) {
            map.put((char) ('2' + i), values[i]);
        }
        solve(0, "", res, digits);
        return res;
    }

    public void solve(int index, String current, List<String> res, String digits) {

        // Base case
        if (index == digits.length()) {
            res.add(current);
            return;
        }

        char digit = digits.charAt(index);
        String letters = map.get(digit);

        for (int i = 0; i < letters.length(); i++) {
            solve(index + 1, current + letters.charAt(i), res, digits);
        }
    }
}