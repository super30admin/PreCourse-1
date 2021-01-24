class myStack:
    def __init__(self):
        self.stack = []

    def isEmpty(self):
        return ( self.stack == None )

    def push(self, item):
        self.stack.append( item )

    def pop(self):
        return self.stack.pop()

    def peek(self):
        if not self.isEmpty():
            return self.stack[-1]
        else:
            return -1

    def size(self):
        return len( self.stack )

    def show(self):
        return ( " ".join(self.stack) )

s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
