from sys import maxsize
class myStack:
  #Please read sample.java file before starting.
  #Kindly include Time and Space complexity at top of each file
     def __init__(self): # constructor
         self._data = [] # initializing a list

     def isEmpty(self):
        return len(self._data) == 0
         
     def push(self, item):
          self._data.append(item)
         
     def pop(self):
        if self.isEmpty():
          return str(-maxsize -1) # return minus infinite
        return self._data.pop()
        
        
     def peek(self):
        if self.isEmpty():
          return str(-maxsize -1) # return minus infinite
        return self.data[-1]
        
     def size(self):
       return len(self._data)
         
     def show(self):
       return self._data
         

s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
