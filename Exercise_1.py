# Time Complexity : Included with Each Function
# Space Complexity :  Included with Each Function
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : I could not understand the Space Complexity Part for the code. Can you please clarify


# Your code here along with comments explaining your approach


from xmlrpc.client import Boolean


class myStack:
    # Please read sample.java file before starting.
    # Kindly include Time and Space complexity at top of each file

    def __init__(self):

        """
        Constructor Function to initialize the Array

        :return: None

        """

        self.stack = []

    def isEmpty(self):
        """
        Function to detect if Stack is empty

        :return: Boolean

        :Time: O(n)
        :Space: O(1) ? (Can you explain what this would be)
        """
        return len(self.stack) == 0

    def push(self, item):
        """
        Function to Push an element into the Stack. (At the Last Position)

        :return: None

        :Time: O(n)
        :Space: O(1) (Can you explain what this would be)
        """
        self.stack.append(item)

    def pop(self):
        """
        Function to Pop an element from the Stack. (From the Last Position)

        :return: None

        :Time: O(1)
        :Space: O(1) (Can you explain what this would be)
        """
        if not (self.isEmpty()):
            self.stack.pop()

    def peek(self):
        """
        Function to Retrieve the Top element of the Stack

        :return: Object?

        :Time: O(1)
        :Space: O(1) (Can you explain what this would be)
        """

        if self.isEmpty():
            return None
        else:
            return self.stack[-1]

    def size(self):
        """
        Function to Return the Size of the Stack

        :return: Int
        :Time: O(n)
        :Space: O(1) (Can you explain what this would be)
        """
        return len(self.stack)

    def show(self):
        """
        Function to Print the Current Stack

        :return: List
        :Time: O(1)
        :Space: O(n) (Can you explain what this would be)

        """
        return self.stack


s = myStack()
s.push("1")
print(s.show())
s.push("2")
print(s.show())
print(s.pop())
print(s.size())
print(s.show())
s.push("3")
print(s.size())
print(s.show())
print(s.peek())
print(s.show())
print(s.pop())
print(s.show())
print(s.isEmpty())
print(s.pop())
print(s.isEmpty())
print(s.peek())
