# Implement Singly Linked List

# Any problem you faced while coding this : remove operation
# Time complexity : O(n)
# Space complexity : O(n)

class ListNode:
    """
    A node in a singly-linked list.
    """
    def __init__(self, data=None, next=None):
        self.data = data
        self.next = next
    
class SinglyLinkedList:

    def __init__(self):
        # Create a new singly-linked list. Takes O(1) time.
        self.head = None
        self.tail = None
        self.length = 0

    def isEmpty(self):
        if self.head == None:
            return True
        else:
            return False

    def append(self, data):
        # Insert a new element at the end of the list. Takes O(n) time.
        if self.isEmpty():
            self.head = ListNode(data)
            self.tail = ListNode(data)
        else:
            self.tail.next = ListNode(data)
            self.tail = self.tail.next
        
    def find(self, key):
        # Search for the first element with `data` matching `key`. Return the element or `None` if not found. Takes O(n) time.
        current = self.head
        node_id = 1
        while current is not None:
            if current.has_value(key):
                return current
            node_id = node_id + 1

    def remove(self, key):
        # Remove the first occurrence of `key` in the list. Takes O(n) time.
        temp = self.head
        if (temp is not None):
            if (temp.data == key):
                self.head = temp.next
                temp = None
                return
        while(temp is not None):
            if temp.data == key:
                break
            prev = temp
            temp = temp.next
        if(temp == None):
            return
        prev.next = temp.next
        temp = None


