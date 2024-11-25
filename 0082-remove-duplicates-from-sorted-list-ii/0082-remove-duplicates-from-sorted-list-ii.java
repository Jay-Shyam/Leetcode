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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode dummy = new ListNode(-1);
        dummy.next=head;
        ListNode prev = dummy;
        ListNode node = head;
        while(node!=null){
            if(node.next!=null&& node.val == node.next.val){
            while(node.next!=null&& node.val == node.next.val){
                node = node.next;
            }
            prev.next = node.next;
            }else{
                prev=prev.next;
            }

            node=node.next;
        }
        return dummy.next;

    }
}
