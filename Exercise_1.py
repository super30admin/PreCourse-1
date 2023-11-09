# Time complexity :- O(1)
# Space complexity :- O(n)

class myStack:
    # Please read sample.java file before starting.
    # Kindly include Time and Space complexity at top of each file
    def __init__(self):
        self.stack = []
        self.top = -1
    # check if the stack is empty
    def isEmpty(self):
        return self.top == -1

    # push an item to the stack  and increment the size of the stack
    def push(self, item):
        self.top += 1
        self.stack.append(item)

    # to pop an element, we need to check if the stack is empty, after pop operation, decrease the stack size by 1
    def pop(self):
        if not self.isEmpty():
            self.top -= 1
            self.stack.pop()

    # return the top value of the stack but do not remove the element
    def peek(self):
        return self.stack[self.top]

    # return the size of the stack at the given time
    def size(self):
        return len(self.stack)

    # print the stack
    def show(self):
        return self.stack


s = myStack()
s.push('1')
s.push('2')
s.push('3')
print(s.pop())
print(s.show())
