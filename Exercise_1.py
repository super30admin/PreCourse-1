"""
Time Complexity : O(1)
Space Complexity : 0(1)
Did this code successfully run on Leetcode :
Any problem you faced while coding this : None

// Your code here along with comments explaining your approach
"""

class myStack:
    # Please read sample.java file before starting.
    # Kindly include Time and Space complexity at top of each file
    def __init__(self):
        # define a stack
        self.a_stack = []

    def isEmpty(self):
        # check if stack is empty or not
        return self.a_stack == []

    def push(self, item):
        # append an item to the stack
        self.a_stack.append(item)

    def pop(self):
        # check if the stack has at least one value
        if not self.isEmpty():
            # if the stack is not empty,
            # assign the value of top element to top_item variable
            top_item = self.a_stack[-1]
            # delete the top item
            del (self.a_stack[-1])
            return top_item
        else:
            # if stack is empty
            return -1

    def peek(self):
        # check if the stack hast at least one value
        if not self.isEmpty():
            # assign value of top value to a variable
            top_item = self.a_stack[-1]
            return top_item
        else:
            return -1

    def size(self):
        # use built-in len function to get size of the stack
        return len(self.a_stack)

    def show(self):
        # return stack values to print them
        # when show function is called
        return self.a_stack


s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
