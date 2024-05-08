"""
 Time Complexity : 
 Push - O(1)
 Pop - O(1)
 Peek - O(1)
 Empty - O(1)
 Show - O(1) 

 Space Complexity : O(n) where n is no of elements in stack
 Did this code successfully run on Leetcode : Yes
 Any problem you faced while coding this : No


 Your code here along with comments explaining your approach :
 1. __init__ method : Initialized stack and to replicate overflow behavior we're using max size.
 2. isEmpty method : Checking against the list length to see if stack is empty.
 3. push method : Checking if the size of list after appending the current element exceeds the max_size & if yes we're raising an exception for overflow behavior else we're pushing the new element.
 4. pop method : Checking if the list is empty, if yes we're returning 0 and printing underflow else we're retrieving the last element of the list and returning it.
 5. peek method : Checking if the list is empty, if yes we're raising an exception for stack empty behavior else we're retrieving the last element of the list and returning it.
 6. size method : Returing the list length.
 7. show method : Returning the list.
 
 """



class myStack:
  #Please read sample.java file before starting.
  #Kindly include Time and Space complexity at top of each file
     def __init__(self):
          self.stack = []
          self.max_size = 5 # assuming max size based on other languages to replicate overflow
         
     def isEmpty(self):
          return len(self.stack) == 0
         
     def push(self, item):
          if len(self.stack)+1 > self.max_size:
               print("Stack Overflow")
               raise Exception("Stack Overflow")
          self.stack.append(item)
         
     def pop(self):
          if len(self.stack) == 0:
               print("Stack Underflow")
               return 0
          return self.stack.pop()    
        
     def peek(self):
          if self.isEmpty():
               raise Exception("Stack is empty")
          return self.stack[-1]
        
     def size(self):
         return len(self.stack) 
     
     def show(self):
          return self.stack
         

s = myStack()
s.push('1')
s.push('2')
s.push('1')
s.push('2')
s.push('1')
s.push('2')
print(s.show())
print(s.pop())
print(s.peek())
print(s.pop())
print(s.show())
