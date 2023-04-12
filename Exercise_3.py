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
        nodes = self.head

        while nodes.next:
            nodes = nodes.next
        nodes.next = ListNode(data)
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        nodes = self.head
        while nodes is not None:
           if (nodes.data == key):
            return nodes.data
           nodes = nodes.next
        return None  
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        headVal = self.head

        if (headVal is not None):
            if(headVal.data == key):
                self.head.next = headVal.next
                headVal = None
                return 
        
        while headVal is not None:
            if (headVal.data == key):
                break

            prev = headVal
            headVal = headVal.next

        if (headVal == None):
            return
        
        prev.next = headVal.next
        headVal = None

newLinkedList = SinglyLinkedList()
newLinkedList.head = ListNode(5)
newLinkedList.append(6)
newLinkedList.append(7)
newLinkedList.append(8)
newLinkedList.append(9)
newLinkedList.find(5)
newLinkedList.remove(5)
