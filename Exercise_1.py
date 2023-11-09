class myStack:
    # // Time Complexity : O(n) (push, show)
    # // Space Complexity : O(n)
    # // Did this code successfully run on Leetcode : ?
    # // Any problem you faced while coding this : no
    # // Your code here along with comments explaining your approach

    def __init__(self):
        self.arr = []
        self.top = -1

    def isEmpty(self):
        if self.top == -1:
            return True
        else:
            return False

    def push(self, item):
        self.top += 1           # incrementing top
        self.arr.append(item)   # add item to top of the stack

    def pop(self):
        temp = self.arr[self.top]
        self.top -= 1           # decrementing top
        return temp

    def peek(self):
        if not self.isEmpty():
            return self.arr[self.top]
        else:
            return "Stack is empty."

    def size(self):
        if self.top == -1:
            return "Stack is empty."
        else:
            return self.top + 1

    def show(self):
        i = 0                   # initializing params
        temp = []
        if self.top != -1:
            while i != self.top+1:
                temp.append(self.arr[i])
                i += 1
            return temp
        else:
            return "Stack is empty."


s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
