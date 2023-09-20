#space complexity: O(1)
class ListNode:
    """
    A node in a singly-linked list.
    """
    def __init__(self, data=None):
        self.value = data
        self.next = None
    
class SinglyLinkedList:
    def __init__(self, value):
        """
        Create a new singly-linked list.
        Takes O(1) time.
        """
        new_node = ListNode(value)
        self.head = new_node
        self.tail = new_node
        self.length = 1
        #constructor for the SLL. Head and tail points to the node initialised and length set to 1. 

    def append(self, data):
        """
        Insert a new element at the end of the list.
        Takes O(n) time.
        """
        new_node = ListNode(data)
        if self.length == 0:
            self.head = new_node
            self.tail = new_node
        else:
            self.tail.next = new_node
            self.tail = new_node
        self.length += 1
        return True
        #if sll is empty, head and tail point to the new node created, else, in an existing sll next of tail points to new node and then tail points to new node.
    
        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        if key < 0 or key >= self.length:
            return None
        temp = self.head
        for _ in range(key):
            temp = temp.next
        return temp.data
        #for the key passed we need to return the data present at that no of index. First if key is negative or exceeds length or sll is checked, if true none is returned.
        #else a temporary variable temp is assigned and moved till it reaches that index(key), then data of temp is returned
        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        if key < 0 or key >= self.length:
            return None
        pre = self.find(key-1)
        temp = pre.next
        pre.next = temp.next
        temp.next = None
        self.length -= 1
        return temp.data
        #we need to remove the node present at the passed key(index)
        #first condition for key is checked if it is negative or exceeds length of sll, none is returned
        #else a variable pre is assigned to the node previous to the node to be deleted, and temp is assigned to the node to be deleted. next of pre points to next of temp then temp is removed from sll by assigning next of temp to none. Data of temp is returned

