class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
       
        ListNode current = head;
        int count = 0;
        while (current != null) {
            current = current.next;
            count++;
        }
        if (n == count) {
            return head.next;
        }
        int index = count - n; 
        current = head;
        for (int i = 1; i < index; i++) {
            current = current.next;
        }
        current.next = current.next.next;

        return head;
    }
}