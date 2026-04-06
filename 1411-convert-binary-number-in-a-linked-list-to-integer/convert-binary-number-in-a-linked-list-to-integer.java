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
    public int getDecimalValue(ListNode head) {
        if(head.next == null){
            return head.val;
        }

        StringBuffer binary = new StringBuffer();
        while(head != null){
            binary.append(head.val);
            head = head.next;
        }
        int res = Integer.parseInt(binary.toString(), 2);
        return res;
    }
}