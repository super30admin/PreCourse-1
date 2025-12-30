# Initilaized the class with head and tail 
# append method will check if there is any head avaiable and creates head if not none
# used tail pointer to append to the end of the linked list without iterating through full list 
# updating tail everytime when inserting
# find method will start from the head node and the iterate through the list returns the val if found else None
# remove method will find the key first by maintaing previous node
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
        self.tail = None

    def append(self, data):
        """
        Insert a new element at the end of the list.
        Takes O(n) time.
        """
        new_node = ListNode(data)
        
        if self.head is None:
            self.head = new_node
            self.tail = new_node
            return

        # curr = self.head

        # while curr:
        #     curr = curr.next
        # curr.next = new_node

        self.tail.next = new_node
        self.tail = new_node
        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """

        curr = self.head

        while curr:

            if curr.data == key:
                return curr.data
            curr = curr.next
        return None
        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """

        curr = self.head
        prev = None
        while curr:
            if curr.data == key:
                if prev == None:
                    self.head = curr.next
                else:
                    prev.next = curr.next
            
            
                if curr is self.tail:
                    self.tail = prev
                return True

            prev = curr
            curr = curr.next
        
        return False
