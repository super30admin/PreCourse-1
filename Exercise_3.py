# Time Complexity - O(n) For operations - append, find, remove
# Space Complexity - O(n) to for n nodes 

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
        newElement = ListNode(data)
        if not self.head:
            self.head = newElement # When no linkedList is present, make newElemnt as head
            return
        curr = self.head
        while curr.next:        # Traverse to the last node as mentioned in .java file
            curr = curr.next
        curr.next = newElement  # Point it to new node to be added to linkedList
        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        curr = self.head

        if not self.head:
            return None
        while curr:
            if curr.data == key:    # Found target
                return curr.data 
            curr = curr.next        # Else move to next node
        return None                 # When not found

        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        curr = self.head
        prev = None 

        while curr:
            if curr.data == key:  # Found the node to remove
                if prev is None:   # If head node is to be removed, update head
                    print(curr.data)
                    self.head = curr.next
                else:
                    prev.next = curr.next # Move past the current node
                return True # Removed node
            prev = curr # Move prev to where current is
            curr = curr.next # Move current
        return False # Did not find
    
if __name__== "__main__" :  

    listNodeInstance =  SinglyLinkedList()
    listNodeInstance.append(9)   # Add 9 to list
    listNodeInstance.append(5)   # Add 5 to list
    listNodeInstance.find(9)     # Find node with 9
    listNodeInstance.remove(9)   # Remove node with 9
    print(listNodeInstance.find(9))  #  None as 9 is removed


