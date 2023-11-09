"""
Time Complexity : O(1) to create
O(n) to append, find, remove
Space Complexity : O(n)
"""


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
        new_node = ListNode(data)
        if self.head == None:
            self.head = new_node

        else:
            temp = self.head
            while True:

                if temp.next is None:
                    temp.next = new_node
                    break
                temp = temp.next

    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        index = 0
        temp = self.head
        while temp:
            if temp.data == key:
                return index
            temp = temp.next
            index += 1

    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        prev = self.head
        temp = prev.next

        if prev.data == key and prev is self.head:
            self.head = temp
        else:
            while temp:
                if temp.data == key:
                    prev.next = temp.next
                    break
                prev = prev.next
                temp = prev.next

    def printList(self):
        temp = self.head
        while (temp):
            print(temp.data)
            temp = temp.next


sl = SinglyLinkedList()
sl.append(1)
sl.append(2)
sl.append(3)
sl.append(4)
sl.remove(3)
sl.printList()
result = sl.find(2)
print(result)
