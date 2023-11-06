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
        temp = ListNode(int(data))
        temp2 = self.head
        if temp2 == None:
            self.head = temp
        else:
            while temp2.next!=None:
                temp2=temp2.next

            temp2.next = temp
        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        temp2 = self.head
        while temp2:
            if temp2.data == key:
                return temp2
            
        return None
        
        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        temp2 = self.head
        if temp2 and temp2.data == key:
            self.head = temp2.next
            return
        temp1 = None

        
        while temp2:
            if temp2.data == key:
                temp3 = temp2.next
                temp1.next =temp3
                return
            temp1=temp2
            temp2=temp2.next
            
