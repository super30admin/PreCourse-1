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
        if self.head:
            current = self.head
            while current.next:
                current = current.next
            current.next = newNode
        else:
            self.head = newNode

        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        current = self.head
        while current:
            if current.data == key:
                return key
            current = current.next
        return None

        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        # 1 -> 2 -> 3 -> 4
        # previous = 1,1
        # current =  2,2
        # del 3 -> when previous = (2,2) and current = (3,3) -> point previous next  to current next => previous = (2,3)
        # final linked list = 1_-> 2 -> 4

        previous = self.head
        current = previous.next
        while current:
            if current.data == key:
                previous.next = current.next
                current.next = None
            current = current.next
            previous = previous.next

if __name__ == '__main__':
    print("Test")
