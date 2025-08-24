class myStack:
# Time Complexity : isEmpty O(1), push O(1), pop O(1), peek O(1), size O(1), show O(n) n being the size of the stack
# Space Complexity : O(n) number of elements added in the stack 
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : not much, have to brush up my concepts about stack and its functionalities

# Stack is a data structure with Last in first out behaviour and it has the following functionalities in it 

     def __init__(self):
          # intiating the stack
          self.capacity = 100 # defining the capacity of the stack, lets say the capacity of the stack is 100
          self.stack = [None]*self.capacity # creating an array of size 100
          self.top = -1 # we need this index to identify which index to push or pop, since we don't know till where the array has be filled, we need an index to keep track off
         # also why -1 and not 0, if the top index is 0, when the first element is pushed it is kept at 1 but the first element should be at 0th index, that's why since the stack is not pushed yet, top index is -1
     
     def isEmpty(self):
          # since we intialized that the index top will be -1 if no elements are pushed we can check with that condition
          return self.top == -1

         
     def push(self, item):
          # adding elements to the array
          # first iterating the index and adding at that index
          # but an edge case here, what if we push an element beyond stack capacity, we have to check that case
          if self.top == self.capacity -1:
               raise Exception ("Stack reached its capacity")
        
          self.top += 1
          self.stack[self.top] = item
         
     def pop(self):
          # pop the last element of the stack 
          if self.isEmpty():
               raise Exception ("Stack has no elements to pop")
          
          item = self.stack[self.top] # got the item, will return the element but also need to remove this element from stack
          self.stack[self.top] = None # removed the element and kept it back to none
          self.top -= 1 # also now we should also push the index back, since after poping the last element in the stack is at top -=1 
          return item        
        
     def peek(self):
          # peek is to just take a peek of the top element without removing it 
          if self.isEmpty():
               return None
          return self.stack[self.top]
        
     def size(self):
          # size of the number of elements added in the stack
          return self.top + 1 # why +1 , top the first element is added at 0th index, so without adding 1 we wil be gettign wrong size
         
     def show(self):
          #  show the elements of the stack 
          return self.stack[:self.top+1] # why added +1 here because, lets say the top value is 8, it prints the elemets from [0:8+1], 0 to 8, the last index is not inclusive
         

s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
