## Author: Ritika Chadha
# Exercise_1 : Implement Stack using Array

# Time Complexity : O(1)
# Space Complexity : O(len(arr)); size of the array
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

class myStack:
   # Initializing an array to be used as stack
     def __init__(self):
        self.arr = []
   
   # Checking if the array(stack) is empty
     def isEmpty(self):
        if not self.arr:
            return 1
        else:
            return 0
   
   # Add element to the stack
     def push(self, item):
        self.arr.append(item)
   
   # Remove the last element from the stack, return error if the stack is empty      
     def pop(self):
        if self.isEmpty():
            return 'Stack is Empty'
        else:
            elem = self.arr[len(self.arr)-1]
            self.arr = self.arr[:len(self.arr)-1]
            return elem
   
   # Print the top element in the stack
     def peek(self):
        if self.isEmpty():
            return 'Stack is Empty'
        else:
            elem = self.arr[len(self.arr)-1]
            return elem
   
   # Print the size of the array or the stack
     def size(self):
        return len(self.arr)
   
   # Print the stack
     def show(self):
        return self.arr
         

s = myStack()
s.push('1')
s.push('2')
s.push('3')
print(s.pop())
print(s.show())