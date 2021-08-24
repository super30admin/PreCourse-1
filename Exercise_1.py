#Time Complexity:O(1) for each operation
class myStack:
  #Please read sample.java file before starting.
  #Kindly include Time and Space complexity at top of each file
     def __init__(self):
         self.arr = []
     def isEmpty(self):
          if self.arr == []:
               return True
          else:
               return False
     def push(self, item):
          self.arr.append(item)
     def pop(self):
          if self.arr != []:
               item = self.arr[-1]
               del self.arr[-1]
               return item
          else:
               return False
        
     def peek(self):
          if self.arr != []:
               item = self.arr[-1]
               return item
          else:
               return False
     def size(self):
          lt = len(self.arr)
          return lt
     def show(self):
          return self.arr
         

s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
