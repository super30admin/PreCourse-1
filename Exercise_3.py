'''
Time Complexity
1) append - O(n)
2) find - O(n)
3) remove - O(n)
'''


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
        node = ListNode(data)

        if not self.head:
            self.head = node
            return

        currentNode = self.head

        while currentNode.next:
            currentNode = currentNode.next

        currentNode.next = node

    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        if not self.head:
            return

        currentNode = self.head

        while currentNode:
            if currentNode.data == key:
                return currentNode

            currentNode = currentNode.next

        return None

    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """

        currentNode = self.head
        prevNode = None

        while currentNode:

            if currentNode.data == key:
                if prevNode:
                    prevNode.next = currentNode.next
                else:
                    self.head = currentNode.next

                return None

            prevNode = currentNode
            currentNode = currentNode.next

        return None
