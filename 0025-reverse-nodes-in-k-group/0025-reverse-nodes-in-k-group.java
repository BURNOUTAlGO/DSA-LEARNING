/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {

        if(head==null) return null;

        int c = k ;
        ListNode curr = head;
        ListNode prev = null;
        ListNode next= null;

        // reverse the k-group and remaining 
        //suppose k =3 and our list [ 1->2->null ] ----it also reverse--- [ 2->1->null]  so we have to reverse again 
        while(curr!=null && c>0){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
            c--;
        }

        //reverse again
        if(curr==null && c>0){
            curr = prev;
            prev=null;
            next=null;
            while(curr!=null){
                next=curr.next;
                curr.next=prev;
                prev=curr;
                curr=next;
            }

        }
        if(c>0){
            return prev;
        }else{
            head.next=reverseKGroup(curr,k);

        }

        return prev;
    }
}