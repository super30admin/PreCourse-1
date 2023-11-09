#Time Complexities: 
# isEmpty()-> O(1)
# push()-> O(1)
# pop()-> O(1)
# peek()-> O(1)
# size()-> O(1)
# show()-> O(1)

class myStack:

    def __init__(self):
      self.stack=[]
    
    def isEmpty(self):
      if self.stack:
        return True
      else:
        return False
     
    def push(self, item):
      self.stack.append(item)
         
    def pop(self):
      self.stack.pop()
          
    def peek(self):
      return self.stack[-1]
        
    def size(self):
      return len(self.stack)
         
    def show(self):
      return self.stack


s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
print(s.size())
print(s.isEmpty())
