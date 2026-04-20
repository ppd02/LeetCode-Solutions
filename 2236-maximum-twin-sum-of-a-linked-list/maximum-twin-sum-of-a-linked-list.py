# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def pairSum(self, head: Optional[ListNode]) -> int:
        if head == None:
            return None

        temp = head
        elements = []
        while temp != None:
            elements.append(temp.val)
            temp = temp.next

        first, last, total = 0, len(elements)-1, 0

        while first < last:
            total = max(total, elements[first] + elements[last])
            first += 1
            last -= 1

        return total