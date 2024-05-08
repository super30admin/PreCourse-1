class myStack:
  #Please read sample.java file before starting.
  #Kindly include Time and Space complexity at top of each file
     def __init__(self):
         self.s = []
     def isEmpty(self):
         return len(self.s) == 0
     def push(self, item):
         self.s.append(item)
     def pop(self):
        if self.isEmpty():
            return None
        return self.s.pop()        
        
     def peek(self):
        if self.isEmpty():
            return None
        return self.s[-1]        
     def size(self):
        return len(self.s) == 0 
     def show(self):
        return s 

s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
