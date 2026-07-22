
class Solution {
    public Node copyRandomList(Node head) {

        if(head==null) return null;

        Node curr = head;
        while (curr != null) {
            Node temp = curr.next;
            curr.next = new Node(curr.val);
            curr.next.next = temp;
            curr = temp;
        }
        curr = head;
        while (curr != null) {
            if (curr.random == null) {
                curr.next.random = null;
            } else {
                curr.next.random = curr.random.next;
            }
            curr = curr.next.next;
        }
        Node orig = head;
        Node copy = head.next;
        Node temp = copy;

        while (orig != null) {

            orig.next = orig.next.next;

            if (copy.next != null)
                copy.next = copy.next.next;

            orig = orig.next;
            copy = copy.next;
        }

        return temp;

    }
}