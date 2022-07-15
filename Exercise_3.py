# Time Complexity : As mentioned, O(1) for initialization (of constructor), O(n) for append, find and remove as we may traverse to the end of list (of n elements)
# Space Complexity :  Each of append, find, remove only use O(1) space i.e constant space 
# Did this code successfully run on Leetcode : Code ran successfully. Did not check for any such problem in leetcode but in general the code ran well for all functions.
# Any problem you faced while coding this : No problems

# Your code here along with comments explaining your approach

class ListNode:
    """
    A node in a singly-linked list.
    """
    def __init__(self, data=None, next=None):
        self.data = data # Assign value of data to self.data in ListNode class, default parameter value is None
        self.next = next # Assign next node to self.next in ListNode class, default parameter value is None
    
class SinglyLinkedList:
    def __init__(self):
        """
        Create a new singly-linked list.
        Takes O(1) time.
        """
        self.head = None # Initialize head of the Singly Linked List to None

    def append(self, data):
        """
        Insert a new element at the end of the list.
        Takes O(n) time.
        """
        add_node = ListNode(data) # Create new node add_node with value data
        if not self.head:
            self.head = add_node # If head is none then make head as the new element we need to add
        else:
            curr = self.head # Mark head as the current node
            while(curr.next):
                curr = curr.next # Traverse to the node next to curr. Repeat until the next node is None i.e until we reach the end mof the list
            curr.next = add_node # Change curr.next from none to the new element we wish to append
        return
        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        if not self.head:
            return None # Return none if the Linked list is empty
        curr = self.head # Initialize current node to head
        while(curr):
            if curr.data == key: # Check if value at current node is our key
                return key # Return the element if the key is found
            curr = curr.next # Move on to the next element in the linked list if current element doesn't have the key value. 
            # Continue loop until either key is found or we reach end of the linked list.
        return None # Return none if the key is not found

        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        if not self.head:
            return # Return if the Linked list is empty as there is no element to remove
        curr = self.head # Initialize current node to head
        while(curr):
            if curr.data == key:# Check if value at current node is our key
                if not curr.next: # If next element does not exist
                    curr.data = None # Make current element null by removing the value 
                    curr.next = None
                else:
                    curr.data = curr.next.data # Change current element value to next element's value 
                    curr.next = curr.next.next # Also change next element to the element after next element
                return key # Return key if it is removed
            curr = curr.next
        return # Return if we reached the end of th Linked list and could not find the element to remove
    
#     def show(self):
#         curr = self.head
#         while(curr):
#             print(str(curr.data)+"->")
#             curr = curr.next
        
# s = SinglyLinkedList()
# s.append(10)
# s.append(20)
# s.append(30)
# # s.show()
# print(s.find(20))
# print(s.remove(10))
# s.show()