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
        if self.head == None:
            self.head = ListNode(data)
            
        else:
            temp = self.head
            
            while(temp.next != None):
                temp = temp.next
            temp.next = ListNode(data)
                       
            
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        temp = self.head
        while(temp):
            if temp.data == key:
                return temp.data
            else:
                temp = temp.next
        return None
        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        temp = self.head
        prev = None

        if temp == None:
            return None
            

        """delete head node"""
        if(temp):
                if temp.data == key:
                    print("removing head")
                    self.head = temp.next
                    temp.next = None
                    return key
            
        """not head node"""
        while(temp):
                
                if temp.data == key:
                    print("removing mid or end")
                    prev.next = temp.next
                    temp.next = None
                    return key
                    
                prev = temp
                temp = temp.next