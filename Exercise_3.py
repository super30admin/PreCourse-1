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
        if self.head is None :
            self.head = ListNode(data)
        else :
            temp = ListNode(data)
            temp.next = self.head
            self.head = temp
        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        headVal = self.head
        if headVal.data == key :
            return key
        
        while headVal.next is not None:
            if headVal.data == key :
                return key
            else:
                headVal = headVal.next
        
        return None

            

        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        headVal = self.head
        if headVal.data == key and headVal.next is not None :
            self.head = headVal.next
            return headVal.data

        while headVal.next is not None:
            if headVal.data == key :
                prev.next = headVal.next
                return headVal.data

            else:
                prev = headVal
                headVal = headVal.next


            
            

