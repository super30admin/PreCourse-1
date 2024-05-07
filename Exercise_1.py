# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No
class myStack:
  #Please read sample.java file before starting.
  #Kindly include Time and Space complexity at top of each file
     def __init__(self):
         self.stack = []

     # Time Complexity: O(1) (constant time)
     # Space Complexity: O(1) (constant space)
     def isEmpty(self):
         # Check if the stack is empty
        return len(self.stack) == 0
     
     # Time Complexity: O(1) (constant time)
     # Space Complexity: O(1) (constant space)
     def push(self, item):
         # Add an item to the top of the stack
        self.stack.append(item)
     
     # Time Complexity: O(1) (constant time)
     # Space Complexity: O(1) (constant space)
     def pop(self):
        # Remove and return the top item from the stack
        if not self.isEmpty():
            return self.stack.pop()
        else:
            print("Stack is empty!")
            return None
     
     # Time Complexity: O(1) (constant time)
     # Space Complexity: O(1) (constant space)
     def peek(self):
         # Return the top item without removing it
        if not self.isEmpty():
            return self.stack[-1]
        else:
            print("Stack is empty!")
            return None

     # Time Complexity: O(1) (constant time)
     # Space Complexity: O(1) (constant space) 
     def size(self):
         # Return the number of elements in the stack
        return len(self.stack)

     # Time Complexity: O(n) (linear time)
     # Space Complexity: O(n) (linear space)
     def show(self):
         # Display all elements in the stack
        return self.stack
         

s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
