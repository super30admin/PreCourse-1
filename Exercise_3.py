# Time Complexity :
# Space Complexity :
# Did this code successfully run on Leetcode : No, I'm getting problem in executing it
# Any problem you faced while coding this : I'm stuck in this one!
# Your code here along with comments explaining your approach :

class ListNode:
    """
    A node in a singly-linked list.
    """
    def __init__(self, data=None):
        self.data = data
        self.next = None
    
class SinglyLinkedList:
    def __init__(self):
        """
        Create a new singly-linked list.
        Takes O(1) time.
        """
        self.head = None

    def append(self, data):
        """
        Insert a new element at the end of the list.
        Takes O(n) time.
        """
        new_node = Node(data)
        if not self.head:
            self.head = new_node
            return
        current = self.head
        while current.next:
            current = current.next
        current.next = new_node

    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        current = self.head
        while current:
            if current.data == key:
                return True
            current = current.next
        return False
        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        if not self.head:
            return

        if self.head.data == key:
            self.head = self.head.next
            return

        current = self.head
        while current.next:
            if current.next.data == key:
                current.next = current.next.next
                return
            current = current.next

linked_list = SinglyLinkedList()
linked_list.append(1)
linked_list.append(2)
linked_list.append(3)
print("Is 2 in the list?", linked_list.find(2))
linked_list.remove(2)

