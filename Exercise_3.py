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
        temp = ListNode(data)
        if self.head == None:
            self.head = temp
        else:
            iterator = self.head
            while (iterator.next != None):
                iterator = iterator.next
            iterator.next = temp

    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        if (self.head != None):
            temp = self.head
            while (temp):
                if (temp.data == key):
                    return temp
                temp = temp.next
        return None

    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        temp = self.head
        if (temp.data == key):
            self.head = self.head.next
        else:
            while (temp.next.data != key):
                temp = temp.next
            temp.next = temp.next.next
