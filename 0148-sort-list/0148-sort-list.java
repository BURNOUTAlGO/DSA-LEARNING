import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution {
    public ListNode sortList(ListNode head) {
        if (head == null) return null;

        List<Integer> values = new ArrayList<>();
        ListNode curr = head;

        while (curr != null) {
            values.add(curr.val);
            curr = curr.next;
        }

        Collections.sort(values);

        curr = head;
        for (int val : values) {
            curr.val = val;
            curr = curr.next;
        }

        return head;
    }
}