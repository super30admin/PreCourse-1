# Time Complexity: Append = O(N)
# Time Complexity: Find = O(N)
# Time Complexity: Remove = O(N)
# Space Complexity: O(N) 

class ListNode:
    """
    A node in a singly-linked list.
    """
    def __init__(self, data=None, next=None):
        self.data = data
        self.next = next
    
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
        if self.head is None:
            self.head = ListNode(data)
        else:
            current = self.head
            while current.next is not None:
                current = current.next
            current.next = ListNode(data)
        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        current = self.head
        while current is not None:
            if current.data == key:
                return current
            current = current.next
        return None
        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        if self.head is None:
            return
        if self.head.data == key:
            self.head = self.head.next
            return
        current = self.head
        while current.next is not None:
            if current.next.data == key:
                current.next = current.next.next
                return
            current = current.next
linked_list = SinglyLinkedList()
linked_list.append(4)
linked_list.append(3)
linked_list.append(2)
linked_list.append(1)
element = linked_list.find(10)
if element is not None:
    print("Found element with data:", element.data)
else:
    print("Element not found.")
element = linked_list.find(1)
if element is not None:
    print("Found element with data:", element.data)
else:
    print("Element not found.")
element = linked_list.remove(4)
if element is not None:
    print("Found element with data:", element.data)
else:
    print("Element not found.")
