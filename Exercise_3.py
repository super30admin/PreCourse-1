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
            new_node = ListNode(data)
            next_node = self.head
            while next_node.next is not None:
                next_node = next_node.next
            next_node.next = new_node
        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        next_node = self.head
        while next_node is not None and next_node.data != key:
            next_node = next_node.next
        return next_node.data if next_node is not None else None

    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        curr_node = self.head
        prev_node = None
        while curr_node is not None and curr_node.data != key:
            prev_node = curr_node
            curr_node = curr_node.next
        if curr_node is not None:
            prev_node.next = curr_node.next
        else:
            print("Key not found in list")


l = SinglyLinkedList()
l.append(1)
l.append(2)
l.append(3)
l.append(4)
l.append(5)
print(l)
l.remove(3)
print(l)
print(l.find(4))
