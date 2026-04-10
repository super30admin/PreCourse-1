# Time Complexity : O(1)
# Space Complexity : O(1) 
# Did this code successfully run on Leetcode : yes
# Any problem you faced while coding this : No


# Your code here along with comments explaining your approach

class myStack:
  #Please read sample.java file before starting.
  #Kindly include Time and Space complexity at top of each file
     def __init__(self):
         self.arr = list()
         
     def isEmpty(self):
         return self.size() == 0 
     
     def push(self, item):
         self.arr.append(item)
         
     def pop(self):
         if self.isEmpty():
             return "Stack is Empty"
             
         return self.arr.pop()        
        
     def peek(self):
         if self.isEmpty():
             return "Stack is Empty"
             
         return self.arr[-1]
         
     def size(self):
         return len(self.arr)
     
     def show(self):
         return self.arr
         

s = myStack()
print("Push: 1")
s.push('1')
print("Push: 2")
s.push('2')
print("Show: ",s.show())
print("isEmpty: ",s.isEmpty())
print("Pop: ",s.pop())
print("Show: ",s.show())
print("Pop: ",s.pop())
print("Show: ",s.show())
print("isEmpty: ",s.isEmpty())
print("Pop: ",s.pop())