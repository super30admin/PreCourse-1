class myStack:
  #Please read sample.java file before starting.
  #Kindly include Time and Space complexity at top of each file
     def __init__(self):
      self.elements = []
         
     def isEmpty(self):
         if self.elements == []:
             return True
     def push(self, item):
         self.elements.append(item)
         
      
         
     def pop(self):
         return self.elements.pop()
        
        
     def peek(self):
         return self.elements[len(self.elements)-1]
        
     def size(self):
         return len(self.elements)
         
     def show(self):
         return self.elements

s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
