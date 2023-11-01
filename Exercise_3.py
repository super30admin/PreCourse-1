#Time complexity: O(n)
#Space complexity: O(1)
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
        new_node = ListNode(data)
        if not self.head:
            self.head = new_node
        else:
            current = self.head
            while current.next:
                current = current.next
            current.next = new_node

        """
        Insert a new element at the end of the list.
        Takes O(n) time.
        """

        
    def find(self, key):
        current = self.head
        while current:
            if current.data == key:
                return current
            current = current.next
        return None

        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        
    def remove(self, key):
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
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """

linked_list = SinglyLinkedList()
linked_list.append(1)
linked_list.append(2)
linked_list.append(3)
linked_list.append(4)

element = linked_list.find(8)
if element:
    print("Element found: ", element.data)
else:
    print("Element not found")


linked_list.remove(2)

