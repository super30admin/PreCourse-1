class ListNode:
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
        new_node = ListNode(data)

        if self.head is None:
            self.head = new_node
        else:
            i = self.head
            while i.next is not None:
                i = i.next
            i.next = new_node
        """
        Insert a new element at the end of the list.
        Takes O(n) time.
        """
        
    def find(self, key):
        if self.head is None:
            print("LinkedList is Empty")
            return

        i = self.head
        while i is not None:
            if n.data == key:
                return i.data
            i = i.next
        return None
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        
    def remove(self, key):
        if self.head is None:
            print("Empty Linklist")
            return

        # Deleting first node, if key is the first node
        if self.head.data == key:
            self.head = self.head.next
            return

        # Traversing the LinkedList to find the key and delete the key
        i = self.head
        while i.next is not None:
            if i.next.data == key:
                break
            i = i.next

        if i.next is None:
            print("Key not found in the LinkedList")

        else:
            i.next = i.next.next
