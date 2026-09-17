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
    public ListNode removeElements(ListNode head, int val) {
        ListNode dummy = new ListNode(0);
        ListNode temp = dummy;
        ListNode temp2 = head;
        while(temp2!=null){
            if(temp2.val !=val){
                temp.next = temp2;
                temp = temp.next;
                
            }
            temp2 = temp2.next;
        }
        temp.next =null;
        return dummy.next;
    }
}