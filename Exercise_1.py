# // Time Complexity : O(n)
# // Space Complexity : O(n)
# // Did this code successfully run on Leetcode :
# // Any problem you faced while coding this : Did silly mistake in syntax, nothing apart from this.
#
# // Your code here along with comments explaining your approach

class myStack:
    # Please read sample.java file before starting.
    # Kindly include Time and Space complexity at top of each file
    def __init__(self):
        self.stack = []
        self.top = -1

    def isEmpty(self)              # if top is -1 -> Empty
        if self.top == -1:
            return True
        return False

    def push(self, item):
        self.top += 1              # increase top by 1, and append item to the stack.
        self.stack.append(item)

    def pop(self):
        if self.isEmpty():
            print("Stack is Empty")
        else:
            self.top -= 1                           # Decrease top with -1, pop the top
            print("popped item:", self.stack.pop())

    def peek(self):
        if self.isEmpty():
            print ("Stack is Empty")
        else:
            print("peek is :" + self.stack[self.top])   # Print top of the stack

    def size(self):
        if self.isEmpty():
            print ("Stack is Empty")
        else:
            x = len(self.stack)             #len: default function to print size.
            print("Size is :", x)

    def show(self):
        for i in range(self.top, -1, -1):
            print(self.stack[i])


s = myStack()
s.push('1')
s.push('2')
s.push('3')
s.peek()
s.size()
s.pop()
s.show()
