# // Time Complexity : for most functions O(1) and for show function O(n)
# // Space Complexity : O(n) 
# // Did this code successfully run on Leetcode : NA
# // Any problem you faced while coding this : No
class myStack:
  #Please read sample.java file before starting.
  #Kindly include Time and Space complexity at top of each file
     def __init__(self):
         self.items = []
     def isEmpty(self):
         return(len(self.items) == 0)
     def push(self, item):
        self.items.append(item)
     def pop(self):
        if self.isEmpty():
          raise Exception("Stack is empty")
        return self.items.pop()
        
     def peek(self):
        if self.isEmpty():
          raise Exception("Stack is empty")
        return self.items[-1]
     def size(self):
         return len(self.items)
     def show(self):
        for i in self.items:
            print(i)

s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
