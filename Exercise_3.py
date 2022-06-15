class ListNode:
    """
    A node in a singly-linked list.
    """
    def __init__(self, data=None, next=None):
        self.data=data
        self.next=None
class SinglyLinkedList:
    def __init__(self):
        self.head = None
        """
        Create a new singly-linked list.
        Takes O(1) time.
        """

    def append(self, data):
        """
        Insert a new element at the end of the list.
        Takes O(n) time.
        """
        newNode=ListNode(data)
        if self.head is None:
            self.head=newNode
            return

        last=self.head
        while(last.next):
            last=last.next
        last.next=newNode

    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        ptr = self.head
        while(ptr):
            if(ptr.data == key):
                return key
            ptr = ptr.next
        return None

    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        ptr=self.head
        if(ptr.data == key):
            self.head = self.head.next
        else :
            while(ptr.next is not None):
                if(ptr.next.data == key):
                    ptr.next = ptr.next.next
                if (ptr.next is not None):
                    ptr = ptr.next

ll= SinglyLinkedList()
ll.append(5)
ll.append(10)
ll.append(25)
ll.append(30)
ll.remove(25)
search_key = ll.find(25)
print(f"\nThis is the element you are searching for {search_key}")
search_key = ll.find(15)
print(f"\nThis is the element you are searching for {search_key}")
search_key = ll.find(5)
print(f"\nThis is the element you are searching for {search_key}")
