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
        node = ListNode(data)
        if self.head is None:
            self.head = node
            return
        else:
            last = self.head
            while last.next:
                last = last.next
            last.next = node

    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        curr = self.head
        while curr is not None:
            if curr.data == key:
                return curr.data
            curr = curr.next

        return None

    def iterate(self):
        current = self.head
        while current:
            print(current.data)
            current = current.next

    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        curr = self.head
        if curr is not None:
            if curr.data == key:
                self.head = curr.next
                curr = None
                return

        while curr is not None:
            if curr.data == key:
                break
            prev = curr
            curr = curr.next

        if curr == None:
            return

        prev.next = curr.next
        curr = None


list = SinglyLinkedList()
list.append(1)
list.append(2)
list.append(3)

keyy = list.find(2)
print("keyy", keyy)
#list.remove(3)
listt = list.iterate()
print(listt)
