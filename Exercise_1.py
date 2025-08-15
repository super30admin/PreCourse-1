# TC:
#  - Push: O(1)
#  - Pop: O(1)
# SC:
#  - O(N) where N is the length of array after pushing N elements into it
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
      if self.isEmpty():
         return "Stack is empty"
      return self.arr.pop()
      
   def peek(self):
      return self.arr[-1]
      
   def size(self):
      return len(self.arr) 
   
   def show(self):
      return self.arr
   
         

s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
