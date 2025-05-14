# Time complexity - For Insertion, search, and Deletion it's O(n) as we have to iterate over all nodes
# Space Complexity - O(1) Linked List will store just data and next pointer



class ListNode:
    """
    A node in a singly-linked list.
    """
    def __init__(self, data=None, next=None):
        self.data = data
        self.next = None
    
class SinglyLinkedList:
    def __init__(self):
        """
        Create a new singly-linked list.
        Takes O(1) time.
        """
        self.head = ListNode(-1)

    def append(self, data):
        """
        Insert a new element at the end of the list.
        Takes O(n) time.
        """
        curr = self.head.next
        if curr == None:
            self.head.next = ListNode(data)
            return
        while curr.next:
            curr = curr.next
        curr.next = ListNode(data)
        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        curr = self.head.next
        while curr:
            if curr.data == key:
                return curr.data
            curr = curr.next
        return None
        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        curr = self.head.next
        while curr.next:
            if curr.next.data == key:
                curr.next = curr.next.next
                return True
            curr = curr.next
        return False
    
    def show(self):
        res = []
        curr = self.head.next
        while curr:
            res.append(curr.data)
            curr = curr.next
        return res
ll = SinglyLinkedList()
ll.append(1)
ll.append(2)
ll.append(3)
ll.append(4)
ll.append(5)
ll.append(6)
print(ll.show())
print(ll.find(6))
print(ll.find(7))
print(ll.remove(6))
print(ll.show())
print(ll.remove(6))
print(ll.find(3))
