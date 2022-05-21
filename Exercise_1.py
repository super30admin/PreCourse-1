class myStack:
  #Please read sample.java file before starting.
  #Kindly include Time and Space complexity at top of each file
     def __init__(self):
       self.l = list()
         
     def isEmpty(self):
         return len(self.l) == 0
     def push(self, item):
       self.l.append(item)
         
     def pop(self):
        return self.l.pop()
        
     def peek(self):
        return self.l[-1]
     def size(self):
       return len(self.l)
         
     def show(self):
       return self.l
         

s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
