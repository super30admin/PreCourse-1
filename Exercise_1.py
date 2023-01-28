class myStack:
  #Please read sample.java file before starting.
  #Kindly include Time and Space complexity at top of each file
     arr = []
     def __init__(self):
      self.arr = []
     def isEmpty(self):
      if len.self.arr == 0:
        return True
      else:
        return False
     def push(self, item):
      arr1 = [item]
      for i in self.arr:
        arr1.append(i)
      self.arr = arr1
     def pop(self):
      item = self.arr[0]
      for i in range(len(self.arr) - 1):
        self.arr[i] = self.arr[i+1]
      return item
     def peek(self):
      return self.arr
     def size(self): 
      return len(self.arr)
     def show(self):
      for i in self.arr:
        return i
         

s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
print(s.pop())
print(s.show())
