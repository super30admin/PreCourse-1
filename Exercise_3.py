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
        if self.head is None:
            self.head = ListNode(data)
        else:
            temp = self.head
            new_node = ListNode(data)
            while temp.next is not None:
                temp = temp.next
            temp.next = new_node




        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        temp = self.head

        while temp is not None:    
            if temp.data == key:
                return temp
            temp = temp.next

        return None


        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        if self.head == key:
            self.head = self.head.next
            return
        elif self.head is None:
                return ' '
        else:
            prev = self.head
            curr = self.head.next
            while prev.next is not None:
                if curr.data == key:
                    prev.next = curr.next
                    return 

        return 
                     

