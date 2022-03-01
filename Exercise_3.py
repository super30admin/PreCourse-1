# Brute Force - Two Pass Solution

#Time Complexity - O(n)
#Space Complexity - O(1)

class Solution:
    def middleNode(self, head: Optional[ListNode]) -> Optional[ListNode]:
        curr = head
        size = 0
        while curr:
            size += 1
            curr = curr.next
        
        middle = size // 2
        curr = head
        print(curr)
        for i in range(middle):
            curr = curr.next
        return curr
    
# Two Pointer - One Pass Solution

#Fast pointer runs twice as fast than slow pointer, which will land slow to the middle when fast reaches the end.
#Time Complexity - O(n)
#Space Complexity - O(1)


class Solution:
    def middleNode(self, head: Optional[ListNode]) -> Optional[ListNode]:
        slow = fast = head
        while fast and fast.next:
            slow = slow.next
            fast = fast.next.next
        return slow
        