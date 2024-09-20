"""
    Stack is a type of LIFO (Last in First Out) data structure meaning last added element is processed first.
     There are multiple operations that can be performed on the stack.
    (1) push element to stack (2) pop element from stack (3) peek element from stack (4) get size of stack and more.
    This program implement stack using array and perform operations such as push, pop, peek, get size of stack,
    print stack.
    """

class MyStack:
    def __init__(self):
        """
        Constructor for class MyStack, called when an object/instance of the class is created.
        stack is implemented using array. Element are added/popped from the end of the array.
        Takes O(1) time.
        """
        self.stack = []

    def isEmpty(self):
        """
        This is a method to check if the stack is empty
        Parameters:
            None
        Returns:
            boolean
        Example:
            stack = MyStack()
            stack.isEmpty() # Return True if stack is empty
        TC: O(1) because the size of array can be retrieved in O(1) time
        """
        if self.stack:
            return True
        return False

    def push(self, item):
        """
        This is method to push an element into stack.
        Parameters:
            item: element to be pushed into stack
        Returns:
            None
        Example:
            stack = MyStack()
            stack.push()
        TC: O(1) since an element can be added to array in O(1) time
        """
        self.stack.append(item)

    def pop(self):
        """
        This is method to pop an element from stack.
        Parameters:
            None
        Returns:
            the popped element from stack
        Example:
            stack = MyStack()
            stack.pop()
        TC: O(1) since element can be removed from array in O(1) time
        """
        if self.stack:
            return self.stack.pop()
        return -1

    def peek(self):
        """
        This is method to peek an element from stack.
        Parameters:
            None
        Returns:
            the last element added to stack
        Example:
            stack = MyStack()
            stack.peek()
        TC: O(1) since last element in an array can be accessed in O(1) time
        """
        return self.stack[-1]

    def size(self):
        """
        This is method to return the size of stack
        Parameters:
            None
        Returns:
            the length of stack
        Example:
            stack = MyStack()
            stack.size()
        TC: O(1) since array size can be retrieved in O(1) time

        """
        return len(self.stack)

    def show(self):
        """
        This is method to print the stack.
        Parameters:
            None
        Returns:
            current stack
        Example:
            stack = MyStack()
            stack.show()
        TC: O(n) since need to traverse the whole array
        """
        return self.stack


s = MyStack()
s.push('1')
s.push('2')
print(f"size of the stack is: {s.size()}")
print(s.pop())
print(f"size of the stack is: {s.size()}")
print(f"stack is: {s.show()}")
