class myStack:
  #Please read sample.java file before starting.
  #Kindly include Time and Space complexity at top of each file
     def __init__(self):
       self.arr = []
         
     def isEmpty(self):
        return len(self.arr) == 0
         
     def push(self, item):
        self.arr.append(item)
         
     def pop(self):
        if not self.isEmpty(): 
          return self.arr.pop()
        else:
          return "Array is empty"
        
     def peek(self):
        if not self.isEmpty():
          return self.arr[-1]
        else:
          return "Array is empty"
        
     def size(self):
        return len(self.arr)
         
     def show(self):
        return self.arr
         

s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
