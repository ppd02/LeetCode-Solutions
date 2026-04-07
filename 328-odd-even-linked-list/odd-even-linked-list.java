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
    public ListNode oddEvenList(ListNode head) {
        List<Integer> even = new ArrayList<>();
        List<Integer> odd = new ArrayList<>();
        ListNode temp = head;
        int i = 1;
        while(temp != null){
            if(i%2 != 0){
                odd.add(temp.val);
            }
            else{
                even.add(temp.val);
            }
            i++;
            temp = temp.next;
        }

        odd.addAll(even);
        System.out.println(odd);
        ListNode curr = head;
        int j = 0;
        while(curr != null){
            curr.val = odd.get(j++);
            curr = curr.next;
        }

        return head;
    }
}