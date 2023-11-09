# Time Complexity : O(N) All the operations on linkedlist takes O(N) time to append, find and remove
# Space Complexity : O(N) where N is the number of elements in linkedlist

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
        newNode = ListNode(data)
        if not self.head:
            self.head = newNode
        else:
            current = self.head
            # Iterate over the list till the last node to add newNode
            while current.next:
                current = current.next
            current.next = newNode
        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        current = self.head
        while current:
            if current.data == key:
                return current.data
            current = current.next
        return None # If key is not found
        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        if self.head: #Only attemp to remove if list is not empty
            if self.head.data == key: # Special case if head node is to be removed
                deletenode = self.head #Get reference to head node
                self.head = self.head.next # Make the next node head
                deletenode.next = None # remove link from old head node
            else:
                # Keep track of previous node to delete reference
                current = self.head.next
                prev = self.head
                while current:
                    if current.data == key:
                        prev.next = current.next
                        current.next = None
                        break
                    prev = prev.next
                    current = current.next

    def printList(self):
        current = self.head
        linkedlist = []
        while current:
            linkedlist.append(current.data)
            current = current.next
        print(linkedlist)
        
## Test ##
ll = SinglyLinkedList()
ll.printList()
ll.append(10)
ll.append(20)
ll.printList()
ll.append(30)
ll.append(40)
print(ll.find(5))
print(ll.find(10))
print(ll.find(30))
ll.remove(3)
ll.printList()
ll.remove(10)
ll.printList()
ll.remove(40)
ll.printList()
ll.remove(20)
ll.remove(30)
ll.printList()