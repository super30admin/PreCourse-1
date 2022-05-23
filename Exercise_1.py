"""
Time Complexity : O(1) for all methods
Space Complexity : O(n)
"""


class StackUsingArray:
    stack = []

    def __init__(self):
        self.stack = []
        self.top = -1

    def isEmpty(self):
        if self.top == -1:
            return True
        else:
            return False

    def push(self, element):
        self.stack.append(element)

    def pop(self):
        if (len(self.stack) != 0):
            lastelement = self.stack[-1]
            del (self.stack[-1])
            return lastelement
        else:
            print('the Array is empty')

    def peek(self):
        return self.stack[self.top]

    def size(self):
        if self.isEmpty() == True:
            return 'Stack is empty'
        else:
            return self.top + 1

    def outputstack(self):
        print(self.stack)


if __name__ == "__main__":
    s = StackUsingArray()
    s.push(1)
    s.push(2)
    s.push(3)
    s.push(4)
    s.pop()
    s.peek()
    s.outputstack()
