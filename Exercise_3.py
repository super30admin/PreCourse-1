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
        if self.head == None:
            self.head = ListNode(data)
        else:
            while self.head.next != None:
                self.head = self.head.next
            self.head.next = ListNode(data)

    def append(self, data):
        """
        Insert a new element at the end of the list.
        Takes O(n) time.
        """
        new_node = ListNode(data) 
        if(self.head == None):
            self.head = new_node
        else:  
            current_node = self.head
            while(current_node.next != None):
                current_node = current_node.next

            current_node.next = new_node
        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        if self.head == None:
            return None
        while self.head != None:
            if self.head.data == key:
                return self.head.data
        return None 
        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        if self.head == None:
            return None

        if self.head.data==key:
            self.head=self.head.next
            return

       current_node=self.head
       while current_node.next:
           if current_node.next.data==key:
               current_node.next=current_node.next.next
               return 
          current_node=current_node.next
