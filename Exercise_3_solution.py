class ListNode:
    """
    A node in a singly-linked list.
    """
    def __init__(self, data=None, next=None):
        self.data=data
        self.next=next
    
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
        if self.head is None:
             NewNode=Node(data)
             self.head=NewNode
        else:
             temp=self.head
             while temp.next is not None:
                   temp=temp.next
             NewNode=Node(data)
             temp.next=NewNode
        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        if self.head is None:
             print("Linked list is empty")
        else:
             temp=self.head
             while temp is not None:
                   if temp.data==key:
                         return temp.data
                   else:
                         temp=temp.next
             return None
        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        temp=self.head
        if temp is None:
            return None
        elif temp.data==key and temp.next is None:
            self.head=None
        elif temp.data==key and temp.next is not None:
             self.head=temp.next
        else:
            while temp.next is not None:
                   if temp.next.data==key:
                          temp.next=temp.next.next
                   else:
                        temp=temp.next
            return None
