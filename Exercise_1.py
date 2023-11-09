# Time Complexity : O(1) for push(), pop(), peek(), size(); O(n) for size()
# Space Complexity : O(n)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No


class myStack:

    def __init__(self):
        self.stack = []

    def isEmpty(self):
        if self.stack == []:
            return True
        return False

    def push(self, item):
        # to append the element in the stack at top position.
        self.stack.append(item)

    def pop(self):
        # to Pop last element from the top of the stack
        if not self.isEmpty():
            last = self.stack[-1]  # save the last element
            del (self.stack[-1])  # remove the last element
            return last  # return the removed element
        else:
            return 'Stack is empty!!'

    def peek(self):
        last = self.stack[-1]
        return last

    def size(self):
        return len(self.stack)

    def show(self):
        return self.stack


s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())



