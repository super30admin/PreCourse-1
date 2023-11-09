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
        node = ListNode(data)
        if self.head is None:
            self.head = node
        # Create a Temporary Node, traverse through the linked list and  when you reach the end, insert the new element
        temp = self.head
        while temp.next is not None:
            temp = temp.next
        temp.next = node
        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """ 
        if self.head is None:
            return None

        # Create a Temporary Node and traverse through the linked list

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
        if self.head is None:
            return "Linked List is empty"

        elif self.head.data == key:
            self.head = self.head.next

        else:
            # Creating a Temporary Node and traversing through the linked list to find the key value
            temp = self.head
            while temp.next is not None:

                if temp.next.data == key:
                    temp.next = temp.next.next
                    return "Element was found and removed"
                else:
                    temp = temp.next  





