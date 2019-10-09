class myStack:
    def __init__(self):
        self.a=list()


    def isEmpty(self):
        if not self.a:
            True
        else:
            False


    def push(self, item):
        self.a.append(item)
         
    def pop(self):
        return self.a.pop()
        
    def peek(self):
        return self.a[len(self.a)-1]
    def size(self):
        return len(self.a)
    def show(self):
        return self.a
        
         

s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
