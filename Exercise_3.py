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

        if self.head is None:
            self.head = newNode
        else:
            current = self.head
            while current.next is not None:
                current = current.next
            current.next = newNode
        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        current  = self.head
        while current:
            if current.data == key:
                return key
                break
            current = current.next
        return None
        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        current  = self.head
        if(current.data is key):
            self.head = self.head.next
        else:
            while current.next is not None:
                if current.next.data is key:
                    current.next = current.next.next
                if current.next is not None:
                    current =current.next
                    
    def print(self):

        current = self.head
        while(current is not None):
            print(current.data)
            current = current.next



LinkedList = SinglyLinkedList()
LinkedList.append(5)
LinkedList.append(10)
LinkedList.append(15)
LinkedList.append(20)
LinkedList.append(25)
print(LinkedList.find(15))
LinkedList.remove(20)
LinkedList.print()
