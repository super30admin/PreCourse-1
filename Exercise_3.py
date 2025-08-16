# Time Complexity :O(N) for all the methods 
# Space Complexity : O(N) as stores the linked list nodes
# Did this code successfully run on Leetcode : I tried in VS code 
# Any problem you faced while coding this :No

class ListNode:
    def __init__(self, data=None, next=None):
        self.next = None
        self.data = data
    
class SinglyLinkedList:
    def __init__(self):
        self.head = None

    def append(self, data):
        new_head = ListNode(data)
        if self.head is None:
            self.head = new_head
        else:
            curr = self.head
            while curr.next:
                curr = curr.next
            curr.next = new_head
        
    def find(self, key):
        curr = self.head
        while curr:
            if curr.data == key:
                return curr
            curr = curr.next
        return None

    def remove(self, key):
        curr = self.head
        prev = None
        while curr:
            if curr.data == key:
                if prev:
                    prev.next = curr.next
                else:
                    self.head = curr.next
                return 
            prev = curr
            curr = curr.next

ll = SinglyLinkedList()
ll.append(2)
ll.append(4)
print(ll.find(2))
ll.remove(2)
print(ll.find(2))
