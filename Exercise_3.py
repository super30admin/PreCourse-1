# Time Complexity: O(n)
# Space Complexity: O(1)
# Did this code successfully run on Leetcode: Not in Leetcode, Executed in PyCharm
# Any problem you faced while coding this: Understanding space complexity
# Implement Singly Linked List
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
        if self.head is None:
            self.head = new_node
        else:
            current = self.head
            while current.next is not None:
                current = current.next
            current.next = new_node

    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        current = self.head
        while current is not None:
            if current.data is key:
                return current.data
            else:
                current = current.next
        return None

    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """

        if self.head is None:
            return None
        if self.head.data is key:
            self.head = self.head.next
            return key

        current = self.head
        prev = self.head
        while current is not None:
            if key is current.data:
                prev.next = current.next
                return current.data
            else:
                prev = current
                current = current.next
        return None

    def print(self):
        current = self.head
        numbers = ""
        while current is not None:
            numbers = numbers + str(current.data) + "->"
            current = current.next
        print(numbers)


s = SinglyLinkedList()
s.append(10)
s.append(15)
s.append(20)
s.append(25)
s.append(30)
s.print()

print("Found values:",s.find(25), s.find(20))

print("Removed value:",s.remove(20))
s.print()
print("Is the value present:", s.find(20))

print("Removed head value", s.remove(10))
s.print()

print("Removed value:",s.remove(200))
s.print()
