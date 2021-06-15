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

        newData = ListNode(data)

        if self.head is None:
            self.head = newData
            return

        iterate = self.head
        while iterate.next:
            iterate = iterate.next
        iterate.next = newData
        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """

        iterate = self.head
        while iterate.next:
            if iterate.data == key:
                return key
            iterate = iterate.next
        return None


        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """

        cur_node = self.head
        if cur_node and cur_node.data == key:
            self.head = cur_node.next
            cur_node = None
            return

        if cur_node is None:
            return None

        prev_node = None
        while cur_node and cur_node.data != key:
            prev_node = cur_node
            cur_node = cur_node.next
        prev_node.next = cur_node.next
        cur_node = None

        