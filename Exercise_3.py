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
        if not self.head:
            self.head = ListNode(data)
        else:
            curr = self.head
            while curr.next:
                curr = curr.next
            curr.next = ListNode(data)

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
        if not self.head:
            return
        
        # if head node itself holds the key
        if self.head.data == key:
            self.head = self.head.next
            return

        curr = self.head
        while curr.next:
            if curr.next.data == key:
                curr.next = curr.next.next
                return
            curr = curr.next

# Testing the Singly Linked List
sll = SinglyLinkedList()
sll.append(1)
sll.append(2)
sll.append(3)

print(sll.find(2))  # Output: 2
print(sll.find(4))  # Output: None

sll.remove(2)
print(sll.find(2))  # Output: None
