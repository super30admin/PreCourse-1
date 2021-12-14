class ListNode:
    """
    A node in a singly-linked list.
    """
    def __init__(self, data=None, next=None):
        self.data = None
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
        new_node = SinglyLinkedList(data, None) #creating a new node

        #check if list is empty, if yes make it the 1st node
        if self.head == None:
            self.head = new_node
        #if no, then point the last node to new node
        else:
            tail = self.head
            while tail.next != None:
                tail = tail.next
            tail.next = new_node
        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        #initializing a node pointer
        current = self.head

        while current != None:
            #if current data is found
            if current.data == key:
                return current 
            else:
                current = current.next
        return None #if not found
        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        #storing the head value in a temporary variable as current
        current = self.head

        # check if current node is the key to be deleted, then point the current node to next node
        if current.data == key:
            self.head = current.next #making head as current.next 
            current.next = None #making this as none so that if deleted then we can unlink from the chain
        
        else:
            #traversing through the list to check for the data that needs to be deleted if found then assign the current next to the previous next
            while(current.next != None):
                prev = current.next
                if prev.data == key:
                    current.next = prev.next
                    prev.next = None
                    break
                else:
                    current = current.next


