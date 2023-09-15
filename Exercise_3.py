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
        #appends the element to the last of the linked list
        newNode = ListNode(data)
        """
        Insert a new element at the end of the list.
        Takes O(n) time.
        """
        if self.head is None:
            self.head = newNode
        endelement = self.head
        while (endelement.next):
            endelement = endelement.next
        endelement.next = newNode

    def find(self, key):
        #This function helps to find the specific element with given key
        element = self.head
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        while element != None:
            if element.data == key:
                return element.data
            element = element.next
        else:
            return False

    def remove(self, key):
        #This function removes the element with the given key element
        headval = self.head
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        if (headval is not None):
            if (headval.data == key):
                self.head = headval.next
                headval = None
        while (headval is not None):
            if headval.data == key:
                break
            prev = headval
            headval = headval.next
        if headval is None:
            return 0


s = SinglyLinkedList()
s.append(1)
s.append(2)
s.remove(2)
print(s)
#Exercise_3 is not running completely and getting stuck at the runtime