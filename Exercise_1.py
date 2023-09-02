class myStack:
  #Please read sample.java file before starting.
  #Kindly include Time and Space complexity at top of each file
     def __init__(self):
      self.arr = []

     def isEmpty(self):
      if len(self.arr):
        return False
      else:
        return True
        
     def push(self, item):
      self.arr.append(item)
         
     def pop(self):
      return self.arr.pop()
        
     def peek(self):
      if self.arr:
        return self.arr[-1]
      else:
        return None

     def size(self):
      return len(self.arr)

     def show(self):
      for i in range(0,len(self.arr)):
        print(f'Data at index {i} is {self.arr[i]}')

s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
