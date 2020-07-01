
class myStack:
    storage={}
    index=0

   
    def __init__(self):
        self.storage={}
        self.index=0
         
    def isEmpty(self):
        if self.index==0:
            return True
        else:
            return False
         
    def push(self, item):
        self.storage[self.index]=item
        self.index+=1
         
    def pop(self):
        self.index-=1
        return "element removed"
        
        
    def peek(self):
        if self.index>0:
            return self.storage[self.index-1]
        else:
            return "Stack is empty"
        
    def size(self):
        return self.index
         
    def show(self):
        for i in range(0,self.index):
            print(self.storage[i])

         

s = myStack()
s.push('1')
# print(s.size())
s.push('2')
s.show()
# print(s.pop())
print(s.peek())
# s.show()
