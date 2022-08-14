# Time Complexity : O(1)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode :
# Any problem you faced while coding this : None


# Your code here along with comments explaining your approach

class myStack:
  #Please read sample.java file before starting.
  #Kindly include Time and Space complexity at top of each file
     def __init__(self):
        self.array =[]         
     def isEmpty(self):
         if self.array == []:
             return True
         else:
             return False
         
     def push(self, item):
         self.array.append(item)
         print("The item has been added")
         
     def pop(self):
         if self.isEmpty():
             return "Stack  is Empty"
         else:
             return self.array.pop()
         
        
        
     def peek(self):
         if self.isEmpty():
             return "Stack  is Empty"
         else:
             return self.array[-1]
        
     def size(self):
         return len(self.array)
         
     def show(self):
         arr = self.array
         if self.isEmpty():
             print("Stack is empty")
             return
         for i in arr:
             print(i, end= ' ')
         

s = myStack()
s.push('1')
s.push('2')
s.push('3')

s.pop()
s.show()
