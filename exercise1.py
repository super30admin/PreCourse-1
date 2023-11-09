# time complexity
#space complexity
# Did your code run on Leetcode?
# issues you faced
class Empty:
    pass
#from exception1 import Empty
class myStack:
  #Please read sample.java file before starting.
  #Kindly include Time and Space complexity at top of each file
     def __init__(self):
         self._data = []

     def isEmpty(self):
         return len(self._data)==0
     def push(self, item):
         self._data.append(item)

     def pop(self):
         if self.isEmpty():
             raise Empty('stack is empty')
         return self._data.pop()

     def peek(self):
         if self.isEmpty():
             raise Empty('stack is empty')
         return self._data[-1]

     def size(self):
         return len(self._data)

     def show(self):
        return s._data


s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
