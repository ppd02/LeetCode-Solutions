# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def deleteMiddle(self, head: Optional[ListNode]) -> Optional[ListNode]:
        if head == None or head.next == None:
            return None
        
        temp = curr = head
        prev = None
        
        while head != None and head.next != None:
            prev = curr
            curr = curr.next
            head = head.next.next
        
        prev.next = curr.next
        curr.next = None

        return temp