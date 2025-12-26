class ListNode:
    """
    A node in a singly-linked list.
    """
    
    def __init__(self, data, next=None):
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

        if self.head == None: 
            self.head = ListNode(data)
            return
           
        curr = self.head
        while curr.next:
                curr = curr.next
        curr.next = ListNode(data)    
            



        """
        Insert a new element at the end of the list.
        Takes O(n) time.
        """
        
    def find(self, key):

        curr = self.head
        while (curr):
            if (curr.data == key):
                return curr
            
            curr = curr.next
        return None
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        
    def remove(self, key):
        if self.head and self.head.data == key:
            temp = self.head
            self.head = self.head.next
            temp.next = None
            return
        
        curr = self.head
        while curr and curr.next:
            if (curr.next.data == key):
                temp = curr.next 
                curr.next = curr.next.next
                temp.next = None 
                return
            curr = curr.next
        return None 
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
    def print_list(self):
        curr = self.head

        if curr is None:
            print("List is empty")
            return

        while curr:
            print(curr.data, end=" -> ")
            curr = curr.next
        print("None")

