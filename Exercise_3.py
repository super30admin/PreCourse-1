#Time Complexity: Append - O(n), Find - O(n), Remove - O(n)
#Space Complexity: Append - O(1), Find - O(1), Remove - O(1)

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
        newNode = ListNode(data)
        if self.head:
            tempNode = self.head
            while tempNode.next != None:
                tempNode = tempNode.next
            #tempNode is now the last node in LL
            tempNode.next = newNode
        else:
            self.head = newNode

        return self.head
        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        tempNode = self.head

        while tempNode:
            if tempNode.data == key:
                return tempNode
            tempNode = tempNode.next
        
        #tempNode is None if code reaches this point
        return tempNode
        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        if self.head and self.head.data == key:
            self.head = None
        else: 
            tempNode = self.head
            while tempNode.next:
                if tempNode.next.data == key:
                    tempNode.next = tempNode.next.next
                    break
                tempNode = tempNode.next
    

