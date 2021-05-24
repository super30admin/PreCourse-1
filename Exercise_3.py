class ListNode:
    """
    A node in a singly-linked list.
    """
    def __init__(self, data=None, next=None):
        self.data = data
        self.next_node = next
    
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
        new_node.next_node = self.head
        self.head = new_node
        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        current = self.head
        found = False
        while current and found is False:
            if current.data == key:
                found = True
            else:
                current = current.next_node
        if current is None:
            raise ValueError("Data not in list")
        return current
        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        current = self.head
        previous = None
        found = False
        while current and found is False:
            if current.data == key:
                found = True
            else:
                previous = current
                current = current.next_node
        if current is None:
            raise ValueError("Data not in list")
        if previous is None:
            self.head = current.next_node
        else:
            previous.next_node = current.data

mylist = SinglyLinkedList()
mylist.append(12)
mylist.append(13)
mylist.append(14)
mylist.find(13)
mylist.remove(14)
