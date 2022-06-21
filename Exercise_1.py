# Time Complexity - O(1)
# Space Complexity - O(n)

class myStack:
    def __init__(self):
        self.stack = []
        self.top = -1
        
    def isEmpty(self):
        if self.top == -1:
            return True
        else:
            return False            
            
    def push(self, item):
        self.top += 1
        self.stack.append(item)
            
    def pop(self):
        if self.top == -1:
            return "Cannot pop any item from stack as it is already empty"
        self.top -= 1
        return "Popped item: " + self.stack.pop()

    def peek(self):
        return self.stack[self.top]
        
    def size(self):
        print(len(self.stack))
        
    def show(self):
        for i in range(len(self.stack)):
            print(self.stack[i], end=" ")


s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
