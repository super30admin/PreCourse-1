"""
This is a program to implement singly linked list.
The idea is to have a dummy head node that helps simplify edge cases where the node is inserted at head and
deleted at tail
"""


class ListNode:
    """
    A node in a singly-linked list.
    """

    def __init__(self, data=None, next=None):
        self.next = next
        self.data = data


class SinglyLinkedList:
    def __init__(self):
        """
        Create a new singly-linked list.
        Takes O(1) time.
        """
        self.dummyHead = ListNode(0)
        self.size = 0

    def append(self, data):
        """
        Insert a new element at the end of the list.
        Takes O(n) time.
        """
        newNode = ListNode(data)
        curr = self.dummyHead
        for _ in range(self.size):  # for size = 0, loop doesnt start, size = 1, loop runs once, size =2 , loop runs
            # 2 times
            curr = curr.next

        curr.next = newNode
        self.size += 1

    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        curr = self.dummyHead.next
        while curr:
            if curr.data == key:
                return curr.data
            curr = curr.next

        print("key not found")
        return None

    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        prev = self.dummyHead
        for _ in range(self.size):
            curr = prev.next
            if curr.data == key:
                prev.next = curr.next
                self.size -= 1
                return
            prev = curr

        print("key not present in LL")

    def getLinkedList(self):
        curr = self.dummyHead.next
        while curr:
            print(curr.data)
            curr = curr.next


SinglyLLObj = SinglyLinkedList()
SinglyLLObj.remove(3)
SinglyLLObj.append(1)
SinglyLLObj.append(2)
SinglyLLObj.append(3)
SinglyLLObj.find(3)
SinglyLLObj.getLinkedList()
SinglyLLObj.remove(3)
SinglyLLObj.getLinkedList()
