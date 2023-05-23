class ListNode:
    """
    A node in a singly-linked list.
    """
    def __init__(self, data=None, next=None):
        self.data = data
        self.next = None
    
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
        # we have to check if the linked list is empty or not, if it is empty, the node will be the new head.
        # If it is not empty, we will traverse throught the last element using the loop and append the element at last
        new_node = ListNode(data)
        if self.head is None:
            self.head = new_node # new node as the head
        else:
            curr = self.head    #we'll assign curr to current node and then we'll increament until we reach the end
            while curr.next is not None:
                curr = curr.next
            curr.next = new_node #We'll point the last node to new_node

    
        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        curr = self.head
        while curr.next is not None:
            if curr.data == key: #we'll check using the data if it matches with key
                return curr
            curr = curr.next
        return None
        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        if self.head is None:
            return

        if self.head.data == key:
            self.head = self.head.next #Removing the head and assigning next node as the head
            return

        curr = self.head
        while curr.next:
            if curr.next.data == key:
                if curr.next.next is None:
                    curr.next = None
                else:
                    curr.next = curr.next.next 
                return
            curr = curr.next
    
    def print(self): #Just for printing purpose
        curr = self.head
        while curr is not None:
            print(curr.data)
            curr = curr.next

s = SinglyLinkedList()
s.append(10)
s.append(20)
s.append(30)
s.remove(30)
s.print()   
s.find(30)