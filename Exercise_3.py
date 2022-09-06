#space complexity: O(n)
#time complexity: O(n) for all functions
#difficulty faced: had a difficult time coding all the function for O(n) time as specified here

class ListNode:
    """
    A node in a singly-linked list.
    """
    def __init__(self, data=None, next=None):
        self.next = None
        self.data = data
    
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
        newnode = ListNode(data)
        temp = self.head
        if self.head == None:
            self.head = newnode
        return

        while temp.next:
            temp = temp.next
        temp.next = newnode


    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        temp = self.head
        
        while temp:
            if temp.data == key:
                return temp.data
            temp = temp.next
        return None

        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        temp = ListNode(-1)
        temp.next = self.head
        prevnode = temp

        while prevnode.next is not None:
            if prevnode.next.data == key:
                prevnode.next = prevnode.next.next 
            else:
                prevnode = prevnode.next
        return prevnode.next