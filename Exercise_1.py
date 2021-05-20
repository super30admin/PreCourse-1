class myStack:

    stack = []

    def __init__(self):
        pass

    def isEmpty(self):

        if len(self.stack) == 0:
            return True
        else:
            return False

    # O(1) push using .append()
    def push(self, item):
        self.stack.append(item)

    # O(1) push using .pop()
    def pop(self):
        return self.stack.pop()

    # O(1)
    def peek(self):
        return self.stack[-1]

    # O(n)
    def size(self):
        return len(self.stack)

    # O(1)
    def show(self):
        print(self.stack)


s = myStack()

s.push('1')
s.push('2')

print(s.pop())
print(s.show())
