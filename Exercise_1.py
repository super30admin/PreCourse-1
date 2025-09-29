# Time Complexity :
         # Push: O(1)
         # Pop: O(1)
         # isEMpty: O(1)
         # peek: O(1)
         # size : O(1)
         # show : O(n)


# Space Complexity : o(n)
         
# Did this code successfully run on Leetcode :

# Any problem you faced while coding this :


#Your code here along with comments explaining your approach
class myStack:
  #Please read sample.java file before starting.
  #Kindly include Time and Space complexity at top of each file
     def __init__(self):
        
        self.top =-1  # Pointer to the top of stack (-1 means empty)
        self.capacity=300 # Maximum size of the stack
        self.stack_Array= [0] *self.capacity # Fixed-size array to store stack elements

     def isEmpty(self):
        # Return True if stack is empty, else False
        return self.top == -1
         
     def push(self, item):
        # Push an item onto the stack if not full
         if self.top < self.capacity - 1: # Check if stack has space
            self.stack_Array[self.top+1]=item # Insert item at top
            self.top+=1 # Move pointer to next free position
         else:
            print("Stack is Overflowing") # Cannot push if stack is full
         return None
     def pop(self):
       # Pop the top item from the stack if not empty
        
        if not self.isEmpty():
            value = self.stack_Array[self.top] # Get top item
            self.top -=1
            return value
        else:
            print("Stack is Underflowing") # Cannot pop if stack is empty
        
        
     def peek(self):
        # Return the top item without removing it
        if not self.isEmpty():
            
            return self.stack_Array[self.top]
        return None
     def size(self):
         # Return the number of elements currently in stack
         return self.top+1
     def show(self):
         # Return only the elements currently in the stack (not the full array) 
         return  self.stack_Array[:self.top + 1]
     


     

s = myStack()
s.push('1')
s.push('2')
s.push('3')
s.push('4')
print(s.peek())
print(s.show())
s.pop()
s.pop()
print(s.show())



