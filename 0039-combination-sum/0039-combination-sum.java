import java.util.*;

class Solution {

    public List<List<Integer>> combinationSum(int[] candidates, int target) {

        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ds = new ArrayList<>();

        solve(0, 0, candidates, target, ds, ans);

        return ans;
    }

    public void solve(int index, int sum, int[] arr, int target,
                      List<Integer> ds, List<List<Integer>> ans) {

        // Base Case
        if (sum == target) {
            ans.add(new ArrayList<>(ds));
            return;
        }

        // Stop if out of bounds or sum exceeds target
        if (index == arr.length || sum > target) {
            return;
        }

        // Pick (same element can be used multiple times)
        ds.add(arr[index]);
        solve(index, sum + arr[index], arr, target, ds, ans);
        ds.remove(ds.size() - 1); // Backtrack

        // Don't Pick (move to next element)
        solve(index + 1, sum, arr, target, ds, ans);
    }
}