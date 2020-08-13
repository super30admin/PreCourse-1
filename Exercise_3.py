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
        self.head = None

    def append(self, data):
        """
        Insert a new element at the end of the list.
        Takes O(n) time.
        """
        new_node = ListNode(data)

        if self.head is None:
            self.head = new_node
        else:
            last_node = self.head
            while last_node.next:
                last_node = last_node.next
            last_node.next = new_node
        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        val = self.head
        while val:
            if val.data == key:
                return val
            else:
                val = val.next
        return None

    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        temp_head = self.head

        if temp_head is None:
            return 
        else:
            if temp_head.data == key:
                self.head = temp_head.next
                temp_head = None

            while temp_head != None:
                if temp_head.data == key:
                    break
                prev = temp_head
                temp_head = temp_head.next
            
            prev.next = temp_head.next
            temp_head = None
