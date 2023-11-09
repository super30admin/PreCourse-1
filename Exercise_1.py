// Time Complexity : O(n)
// Space Complexity : O(n)
class myStack:
  #Please read sample.java file before starting.
  #Kindly include Time and Space complexity at top of each file
     def __init__(self):
         self.arr=[]
     def isEmpty(self):
         if len(self.arr)==0:
              return True
         else:
              return False
     def push(self, item):
         self.arr.append(x)
     def pop(self):
        return self.arr.pop()
        
     def peek(self):
        lenOfarr=len(self.arr)
        return self.arr[lenOfarr-1]
     def size(self):
         return len(self.arr)
     def show(self):
         print(self.arr)

s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
