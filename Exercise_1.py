class myStack():

    def __init__(self):
        self.data=[]

    def isEmpty(self):
        if self.data:
             return False
        else:
             return True

    def push(self, item):
        self.data.append(item)

    def pop(self):
        return self.data.pop()

    def peek(self):
         if self.data:
             return self.data[-1]
         else:
             return None
    def size(self):
        return len(self.data)

    def show(self):
         return self.data
        


s = myStack()
s.push('44')
s.push('5')
print(s.pop())
print(s.show())
