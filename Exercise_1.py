# Time: push, pop, peek etc are all O(1) . Show might be O(n) since it goes through all elements
# Space: O(n) because we store everything in a list


# Any problem you faced while coding this :
# I wasn’t sure if pop() should throw an error or return something if the stack is empty.
# Also wasn’t sure how to "peek" without removing the item, but then I realized I can just use -1 index

# Just using a list to simulate a stack.

class myStack:
    def __init__(self):
        self.stack = [] # empty list to hold items

    def isEmpty(self):
        return len(self.stack) == 0

    def push(self, item):
        self.stack.append(item)

    def pop(self):
        if self.isEmpty():
            return "can't pop from empty stack"
        return self.stack.pop()

    def peek(self):
        if self.isEmpty():
            return "empty stack"
        return self.stack[-1]

    def size(self):
        return len(self.stack)

    def show(self):
        return self.stack

# testing it
s = myStack()
s.push('1')
s.push('2')
print(s.pop())    # should be 2
print(s.show())   # should be ['1']

