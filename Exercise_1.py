class myStack:
     def __init__(self):
          self.stackUsingList = []
          self.top = -1
     
     def isEmpty(self):
          if len(self.stackUsingList) == 0:
               return True
          else:
               return False

     def push(self, item):
          self.stackUsingList.append(item)
          self.top +=1
         
     def pop(self):
          if self.isEmpty():
               return "empty"
          else:
               self.top -= 1
               return str(self.stackUsingList[self.top+1])

     def peek(self):
          if self.isEmpty():
               return "stack is empty"
          else:
               return str(self.stackUsingList[top])
        
     def size(self):
          return len(self.stackUsingList)
         
     def show(self):
         return self.stackUsingList[:self.top+1]


s = myStack()

s.push('1')
s.push('2')
print(s.pop())
print(s.show())