# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : Calculating the Time Complexity for the Push Operation. Worst case would be O(n), in case of resizing the Array
#Your code here along with comments explaining your approach

class myStack:
  #Please read sample.java file before starting.
  #Kindly include Time and Space complexity at top of each file
  # Use a list to store stack elements
     def __init__(self):
         self.stack = []
     
     # T: O(1), S: O(1)
     # Check if the stack is empty
     def isEmpty(self):
         return len(self.stack) == 0
     
     # T: O(n), S: (n)
     # Add an element to the stack
     def push(self, item):
         self.stack.append(item)
     
     # T: O(1), S: O(n)
     # Check if the stack is non empty
     # Remove an element from the top of the stack
     def pop(self):
        if self.isEmpty():
            print("Stack underflow. Cannot pop from an empty stack")
            return None
        return self.stack.pop()
    
     # T: O(1), S: (1)
     # Check if the stack is non empty
     # Return the top of the stack w/o removing it
     def peek(self):
        if self.isEmpty():
            print("Stack is Empty. No elements to peek.")
            return None
        return self.stack[-1]
     
     # T: O(1), S: O(1)
     # Return the length of the stack
     def size(self):
         return len(self.stack)
     
     # T: O(n), S: (n)
     # Check if the stack is non empty
     # Print all the elements in the stack
     def show(self):
         if self.isEmpty():
             print("Stack is empty")
         else:
             print(f"Stack Elements: {self.stack}")
             
         

s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
