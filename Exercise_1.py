#Time Complexity: Average Case :O(1) 
#                 Worst Case: O(n) 
# Space Complexity: O(n)
class myStack:
  #Please read sample.java file before starting.
  #Kindly include Time and Space complexity at top of each file
    def __init__(self):
        self.stack = [None] * 10  # Initialize an array with a fixed size
        self.top = -1  
        self.capacity = 10  
    def isEmpty(self):
        return self.top == -1  # Check if the stack is empty

    def push(self, item):
        if self.top + 1 == self.capacity:  # Check if the stack is full
            self.resize()  
        self.top += 1
        self.stack[self.top] = item  # Add the item to the top of the stack

    def pop(self):
        if not self.isEmpty():
            item = self.stack[self.top]  # Get the top item
            self.stack[self.top] = None  # Clear the slot
            self.top -= 1
            return item 
        else:
            return "Stack is empty"  # Handle underflow condition

    def peek(self):
        if not self.isEmpty():
            return self.stack[self.top]  # Return the top item without removing it
        else:
            return "Stack is empty"  # Handle underflow condition

    def size(self):
        return self.top + 1  # Return the number of elements in the stack

    def show(self):
        return self.stack[:self.top + 1]  # Return the current stack as a list

    def resize(self):
        new_capacity = self.capacity * 2  # Double the capacity
        new_stack = [None] * new_capacity  # Create a new array with the new capacity
        for i in range(self.capacity):
            new_stack[i] = self.stack[i]  # Copy elements to the new array
        self.stack = new_stack  # Replace the old array
        self.capacity = new_capacity  # Update the capacity
         

s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
