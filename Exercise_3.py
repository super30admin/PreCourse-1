# Space Complexity : O(n) - Overall takes O(n) space if it stores n elements
# Did this code successfully run on Leetcode : Ran this on VS IDE
# Any problem you faced while coding this : No
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
        Overall takes O(n) space if it stores n elements
        """
        self.head = None

    def append(self, data):
        """
        Insert a new element at the end of the list.
        Takes O(n) time.
        Takes O(1) space.
        """
        # creating a node
        new_node = ListNode(data=data, next=None)
        # if no list exists , make the new node the head of the list
        if not self.head:
            self.head = new_node
        # if there exists elements in the list..
        else:
            current = self.head
            # loop until the end of the list
            while current and current.next:
                current = current.next
            current.next = new_node
            # new node becomes the tail - hence next ptr becomes none
            new_node.next = None
        return self.head

    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        Takes O(1) space.
        """
        # loop through the list and return the node if key matches the node's data
        current = self.head
        while current:
            if current.data == key:
                return current
            current = current.next
        return None

    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        Takes O(1) space.
        """
        current = self.head
        prev = self.head

        # if there is no list return None
        if current is None:
            return None

        # if the head's data is equal to key make head's next as head
        if self.head.data == key:
            self.head = self.head.next
            return self.head

        # loop until the first occurence is found
        while current:
            if current.data == key:
                # if key is found, del and point the prev to current's next
                prev.next = current.next
                del current
                return self.head
            prev = current
            current = current.next
        return self.head

    def print(self):
        # print all the node's data
        current = self.head
        while current:
            print("Node's data is", current.data)
            current = current.next


s = SinglyLinkedList()
# remove element from empty list
s.remove(1)
# append data to list
s.append(1)
s.append(2)
s.append(3)
s.append(4)
s.append(5)
s.append(6)
# print
print("Printing after appending elements:")
s.print()
# find
element = s.find(1)
print("Found data and next node : ", element.data, element.next)

# remove and print
s.remove(1)
print("Printing after removing 1:")
s.print()

s.remove(3)
print("Printing after removing 3:")
s.print()
