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
            return
            
        # Travel to the end of the linked list.
        travellingPointer = self.head
        while travellingPointer.next is not None:
            travellingPointer = travellingPointer.next

        # Append node to linked list.
        travellingPointer.next = newNode
        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        travellingPointer = self.head
        while travellingPointer is not None:
            if (travellingPointer.data == key):
                return travellingPointer
            travellingPointer = travellingPointer.next
        return None
        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        if self.head is None:
            return

        if self.head.data == key:
            self.head = self.head.next
            return
        
        prevNode = self.head
        travellingPointer = self.head.next
        while travellingPointer is not None:
            if (travellingPointer.data == key):
                    prevNode.next = travellingPointer.next
                    travellingPointer.next = None
                    return
            prevNode = travellingPointer
            travellingPointer = travellingPointer.next
