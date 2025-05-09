#Time Complexity:
#Append: O(n)
#Find: O(n)
#Remove: O(n)
#Space Complexity: O(n)
class ListNode:
    """
    A node in a singly-linked list.
    """
    def __init__(self, data=None, next=None):
        self.data = data #Data value in the Node
        self.next = next #Pointer to the next Node
    
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
        new_node = ListNode(data) #Creating a new node for given value of data
        if not self.head:
            self.head = new_node #If condition to check if list is empty
            return
        current = self.head
        while current.next:
            current = current.next
        current.next = new_node #Linking the last node to the new node
        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        current = self.head
        while current:
            if current.data == key:
                return current.data #data fund returning the element for given key
            current = current.next
        return None #If key not found returning none
        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        current = self.head
        prev = None

        while current:
            if current.data == key:
                if prev:
                    prev.next = current.next #Bypassing the node to remove
                else:
                    self.head = current.next #If the node to remove is the head
                return True
            prev = current
            current = current.next
        return False #Given key not found 

