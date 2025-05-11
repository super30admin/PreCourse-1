class myStack:
  #Please read sample.java file before starting.
  #Kindly include Time and Space complexity at top of each file

     __slots__='_top'
     _top : []
     def __init__(self):
         self._top = []
         
     def isEmpty(self):
         # Time complexity - o(1)

         return self._top == []

     def push(self, item):
         # Time complexity - o(1)
         # Space complexity - o(n)
         self._top.append(item)

     def pop(self):
         # Time complexity - o(1)
         # Space complexity - o(1)
        if not self.isEmpty():
            self._top.pop()
        
     def peek(self):
         # Time complexity - o(1)
         # Space complexity - o(1)
         if not self.isEmpty():
            return self._top[-1]
        
     def size(self):
         # Time complexity - o(1)
         # Space complexity - o(1)
         return len(self._top)

     def show(self):
         # Time complexity - o(1)
         # Space complexity - o(n)
         return self._top

         

s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
