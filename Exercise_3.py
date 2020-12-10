#Exercise_3 : Implement Singly Linked List.

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
        newNode = ListNode(data)  #[] -> [1 -> None] -> [1 -> None]
        newNode.next = self.head                    #head^
        self.head = newNode
        
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
       