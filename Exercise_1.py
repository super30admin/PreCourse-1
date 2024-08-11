# Time Complexity = o(1)
# Space Complexity = o(n)
class myStack:
    #Please read sample.java file before starting.
    #Kindly include Time and Space complexity at top of each file

    def __init__(self):
        self.stack = []

    def isEmpty(self):
        if self.stack:
            return False
        else:
            return True
            # If length is zero then it's empty

    def push(self, item):
        return self.stack.append(item)
        # Using append function of list to push item

    def pop(self):
        if not self.isEmpty():
            return self.stack.pop()
        # using pop function of list to pop item if list exists

    def peek(self):
        if not self.isEmpty():
            return self.stack[-1]
        # Getting the top element in stack using last index if list exists

    def size(self):
        return len(self.stack)
        # checking size using "len" keyword

    def show(self):
        return self.stack
        # printing stack


s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
