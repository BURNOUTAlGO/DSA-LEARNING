class Solution {
    public ListNode rotateRight(ListNode head, int k) {

        if(head == null || head.next == null || k == 0) return head;

        // Step 1: find length and tail
        ListNode tail = head;
        int len = 1;

        while(tail.next != null){
            tail = tail.next;
            len++;
        }

        // Step 2: make circular
        tail.next = head;

        // Step 3: reduce k
        k = k % len;
        if(k == 0){
            tail.next = null;
            return head;
        }

        // Step 4: find new tail
        int steps = len - k;
        ListNode curr = head;

        while(steps > 1){
            curr = curr.next;
            steps--;
        }

        // Step 5: break and set new head
        ListNode newHead = curr.next;
        curr.next = null;

        return newHead;
    }
}