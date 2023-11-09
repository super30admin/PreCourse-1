# Time Complexity : O(1)
# Space Complexity : O(n)
# Did this code successfully run on Leetcode : Ran it on VS code
# Any problem you faced while coding this : No
class myStack:
    # Please read sample.java file before starting.
  # Kindly include Time and Space complexity at top of each file
    def __init__(self):
        # initialize array
        self.stack = []

    def isEmpty(self):
        # if length is zero return true else false
        return len(self.stack) == 0

    def push(self, item):
        # push item to the end of the list (top of the stack)
        self.stack.append(item)
        return True

    def pop(self):
        # if stack empty return 0 else pop and return and remove the top element
        if self.isEmpty():
            return("Stack Underflow")
        popped_element = self.stack[-1]
        del(self.stack[-1])
        return popped_element

    def peek(self):
        # return top element
        if self.isEmpty():
            return("Stack is empty")
        return self.stack[-1]

    def size(self):
        # size of the stack
        return len(self.stack)

    def show(self):
        # return the stack
        return self.stack


s = myStack()
s.push('1')
s.push('2')
print(s.peek())
print(s.size())
print(s.pop())
print(s.peek())
print(s.show())
