#  Did this code successfully run on Leetcode : Yes
#  Any problem you faced while coding this : No

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
        if(self.head):
            current = self.head
            # Iterate till end of the Linked List and create a new Node to insert.
            while(current.next!= None):
                current = current.next
            current.next = ListNode(data)
        else:
            self.head = ListNode(data) # make head point to the new data node created.

        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        if(self.head == None):
            return None
        else:
            # Check all nodes if the data matches the key. return data if found else None.
            current = self.head
            while(current != None):
                if(current.data == key):
                    return current.data
                current = current.next
            return None

    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        if(self.head == None):
            return None
        else:
            current = self.head
            previous = self.head
            # check if data which is pointed by head is key or not.
            if(current.data == key):
                data = current.data
                self.head = current.next
                return data
 
            # Iterate till we find the key. Link the node before and after key if the key is found.
            while(current != None):
                if(current.data == key):
                    previous.next = current.next
                    return current.data
                previous = current
                current = current.next
            return None
