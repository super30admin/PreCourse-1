# Time Complexity :push(),isEmpty(),pop(),peek(),size(),show() - O(1)
# Space Complexity :push(),isEmpty(),pop(),peek(),size() - O(1), show() - O(n)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No 

class myStack:
  #Please read sample.java file before starting.
  #Kindly include Time and Space complexity at top of each file
     def __init__(self):
          self.max_size =100
          self.arr = [None]*self.max_size
          #Intialized top of stack as -1 - stack is empty
          self.top_of_stack = -1

     def isEmpty(self):
          return self.top_of_stack == -1

    #There is stack overflow if the array is full
     # Stack is from 0 to top of stack - incrementing the top and assigning item at that particular top of stack - pushing element at the top   
     def push(self, item):
          if self.top_of_stack == self.max_size - 1:
               print("Stack Overflow")
               return
          self.top_of_stack += 1
          self.arr[self.top_of_stack] = item

     #Removing element from the stack it is from top of stack   
     def pop(self):
          if self.top_of_stack == -1:
               return
          item = self.arr[self.top_of_stack] 
          self.top_of_stack -= 1
          return item
     
     #Returning element at the top of stack   
     def peek(self):
          return self.arr[self.top_of_stack]
        
     def size(self):
          return self.top_of_stack+1
     
     #return the elements in the stack    
     def show(self):
          return self.arr[:self.top_of_stack+1]

s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
