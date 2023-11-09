class myStack:
  #Please read sample.java file before starting.
  #Kindly include Time and Space complexity at top of each file

    # Time Complexity : O(1)
    # Space Complexity : O(1)
    # Did this code successfully run on Leetcode : N/A
    # Any problem you faced while coding this : No
    # Initialize the stack with an Array
     def __init__(self):
         self.stack = []

     # Time Complexity : O(1)
     # Space Complexity : O(1)
     # Did this code successfully run on Leetcode : N/A
     # Any problem you faced while coding this : No
     # Returns True is the length is 0, else returns False
     def isEmpty(self):
         return len(self.stack) == 0

     # Time Complexity : O(1)
     # Space Complexity : O(n)
     # Did this code successfully run on Leetcode : N/A
     # Any problem you faced while coding this : No
     # Adds the item to the end of the Array
     def push(self, item):
         self.stack.append(item)

     # Time Complexity : O(1)
     # Space Complexity : O(1)
     # Did this code successfully run on Leetcode : N/A
     # Any problem you faced while coding this : No
     # If the array is empty, then it returns None
     # Else it takes the last element, deletes it and then returns it
     def pop(self):
        if self.isEmpty():
            return None
        else:
            toRet = self.stack[len(self.stack)-1]
            del(self.stack[len(self.stack)-1])
            return toRet

     # Time Complexity : O(1)
     # Space Complexity : O(1)
     # Did this code successfully run on Leetcode : N/A
     # Any problem you faced while coding this : No
     # If the Stack it empty, it returns None, else it returns the last element
     def peek(self):
         if self.isEmpty():
             return None
         else:
             return self.stack[len(self.stack)-1]

     # Time Complexity : O(1)
     # Space Complexity : O(1)
     # Did this code successfully run on Leetcode : N/A
     # Any problem you faced while coding this : No
     # Returns the length of the Stack
     def size(self):
         return len(self.stack)

     # Time Complexity : O(1)
     # Space Complexity : O(1)
     # Did this code successfully run on Leetcode : N/A
     # Any problem you faced while coding this : No
     # Returns the length of the Stack
     def show(self):
         if self.isEmpty():
             print("Stack is Empty!")
         else:
             return self.stack


s = myStack()
print("Size: ", s.size())
print(s.isEmpty())
s.push('1')
print(s.isEmpty())
print("Size: ", s.size())
s.push('2')
print("Size: ", s.size())
print(s.pop())
print("Show: ", s.show())
