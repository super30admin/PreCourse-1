class myStack:
     def __init__(self):
          self.container=[]
         
     def isEmpty(self):
          return self.size() == 0
         
     def push(self, item):
          self.container.append(item)
         
     def pop(self):
        return self.container.pop()
        
     def peek(self):
          if self.isEmpty():
               raise Exception("Stack Empty !")
          return self.container[-1]                    #-1 represents last element of the index
          
        
     def size(self):
          return len(self.container)
         
     def show(self):
          return self.container
         

s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
