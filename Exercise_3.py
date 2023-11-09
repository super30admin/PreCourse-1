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

        if self.head == None: 
            self.head = new_node

        last = self.head 
        while(last.next):
            last = last.next
        last.next = new_node
        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        temp = self. head 

        while(temp is not None):
            if temp.data == key:
                return temp.data

            temp = temp.next
        return None


        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        temp = self. head 

        if (temp is not None):
            if(temp.data == key):
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
