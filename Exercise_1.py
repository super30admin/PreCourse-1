class myStack:
  #Please read sample.java file before starting.
  #Kindly include Time and Space complexity at top of each file
     def __init__(self):
       self.a = []
         
     def isEmpty(self):
       return self.a == []
         
     def push(self, item):
       self.a.append(item)
         
     def pop(self):
       if (len(self.a)>0):
                self.a.pop()
       else:
         return "stack underflow"
        
     def peek(self):
        return self.arr[-1]
        
     def size(self):

         return len(self.a)
     def show(self):
          return self.a 
         

s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
