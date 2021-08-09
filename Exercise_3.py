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
        new_node = ListNode(data)
        curr_node = self.head
        if self.head is None:
            self.head = new_node
        else:

            while curr_node:
                if curr_node.next is None:
                    curr_node.next = new_node
                    break
                curr_node = curr_node.next

    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        curr_node = self.head
        if self.head is None:
            return None
        else:
            while curr_node:
                if curr_node.data == key:
                    return curr_node.data
                curr_node = curr_node.next
        if curr_node is None:
            return None

    def remove(self, key):
        prev_node = curr_node = self.head
        if self.head is None:
            return None
        if self.head.data == key:
            self.head = self.head.next
            return "beginning element deleted"
        else:
            while curr_node:
                if curr_node.data == key:
                    prev_node.next = curr_node.next
                    curr_node = None

                    return "middle/last deleted"
                prev_node = curr_node
                curr_node = curr_node.next
        if curr_node is None:
            return "Key Not found"
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """

    def printlist(self):
        lst = []
        curr_node = self.head
        while curr_node:
            lst.append(curr_node.data)
            curr_node = curr_node.next
        return lst


s = SinglyLinkedList()
s.append(1)
s.append(2)
s.append(3)
s.append(4)
print("print1", s.find(1))

print("print2", s.find(6))  # output should be and is None.

print(s.printlist())
print(s.remove(1))
print(s.printlist())
print(s.remove(3))
print(s.printlist())
print(s.remove(4))
print(s.printlist())
print(s.remove(6))
print(s.printlist())
