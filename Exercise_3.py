# Time complexity: append = O(n), find = O(n), remove = O(n)
# Space complexity: append = O(1), find = O(1), remove = O(1)
# Works on Leetcode: Yes
# Problems faced while solving: took time on remove node part as it is a bit complicated that i had to work
#                               on it on a sketch-board
class ListNode:
    """
    A node in a singly-linked list.
    """
# Defining a node
    def __init__(self, data=None, next=None):
        self.data = data
        self.next = next


class SinglyLinkedList:

    # Initializing an empty linkedlist
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
        # If head is None then assign the newnode to head and point head to None
        if self.head is None:
            self.head = ListNode(data, None)
        else:
            # else find the last node of the linkedlist and point it to the newnode as it is added to the end
            newnode = ListNode(data, None)
            iternode = self.head
            while iternode.next is not None:
                iternode = iternode.next
            iternode.next = newnode
            newnode.next = None

    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        # if head is empty then there is nothing to find
        if self.head is None:
            return None

        iternode = self.head

        # iterate until you find the key and return it, or
        while iternode is not None:
            if iternode.data == key:
                return iternode
            iternode = iternode.next
        # return none as there doesn't exist a node with this particular key
        return None

    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        iternode = self.head
        # iterating until you find a node with the partcular key and removing the node inline to save time and space.
        while iternode.data is not key:
            iternode = iternode.next
        iternode.data = iternode.next.data
        iternode.next = iternode.next.next