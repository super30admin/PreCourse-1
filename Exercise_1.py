#Time and Space Complexity  is O(n)
class myStack:
  #Please read sample.java file before starting.
  #Kindly include Time and Space complexity at top of each file
     def __init__(self):
        self.arr = []

     def isEmpty(self):
        if len(self.arr) == 0:
            return True
        else:
            return False
            
     def push(self, item):
         self.arr.append(item)

     def pop(self):
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