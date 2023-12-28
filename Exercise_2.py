# // Time Complexity : O(N) for show and size, rest O(1)
# // Space Complexity : O(N) for storing the elements in the stack
# // Did this code successfully run on Leetcode : Not on LC
# // Any problem you faced while coding this : No

# // Your code here along with comments explaining your approach
# Implementing a stack using a singly linked list. Basic operations such as push, pop,
# peek are implemented with O(1) complexity, while show and size have O(N) complexity.

class Node:
    """
    A node in the linked list based stack.
    """

    def __init__(self, data):
        self.data = data
        self.next = None


class myStack:
    """
    Stack implementation using a linked list.
    Supports isEmpty, push, pop, peek, size, and show operations.
    """

    def __init__(self):
        """
        Initialize an empty stack.
        Time Complexity: O(1)
        Space Complexity: O(1)
        """
        self.head = None

    def isEmpty(self):
        """
        Check if the stack is empty.
        Time Complexity: O(1)
        Space Complexity: O(1)
        """
        return self.head is None

    def push(self, item):
        """
        Push an item onto the stack.
        Time Complexity: O(1)
        Space Complexity: O(1)
        """
        new_node = Node(item)
        new_node.next = self.head
        self.head = new_node

    def pop(self):
        """
        Remove and return the top item from the stack.
        Time Complexity: O(1)
        Space Complexity: O(1)
        """
        if self.isEmpty():
            return None
        popped_item = self.head.data
        self.head = self.head.next
        return popped_item

    def peek(self):
        """
        Return the top item of the stack without removing it.
        Time Complexity: O(1)
        Space Complexity: O(1)
        """
        if self.isEmpty():
            return None
        return self.head.data

    def size(self):
        """
        Return the size of the stack.
        Time Complexity: O(n)
        Space Complexity: O(1)
        """
        current = self.head
        count = 0
        while current:
            count += 1
            current = current.next
        return count

    def show(self):
        """
        Display all elements in the stack.
        Time Complexity: O(n)
        Space Complexity: O(n) for storing the elements to be printed.
        """
        elements = []
        current = self.head
        while current:
            elements.append(current.data)
            current = current.next
        return elements
