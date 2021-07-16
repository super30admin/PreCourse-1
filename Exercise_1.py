class myStack:
     def __init__(self):
          self.st=[]
         
     def isEmpty(self):
          if not self.st:
               return 1
          return 0
         
     def push(self, item):
          self.st.append(item)
         
     def pop(self):
          if self.st:
               temp = self.st[-1]
               del self.st[-1]
               return temp
          return "Stack is empty."
        
     def peek(self):
          return self.st[-1]
        
     def size(self):
          return len(self.st)
         
     def show(self):
          return self.st
         

s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())

