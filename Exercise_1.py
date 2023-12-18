class myStack:
# Time Complexity : all operations except for show have a time complexity of O(1), show will have a time complexity of O(N)
# Space Complexity : O(N)
# Did this code successfully run on Leetcode : Ran Locally 
# Any problem you faced while coding this : No


# Your code here along with comments explaining your approach
     def __init__(self):
         self.stack = []
     def isEmpty(self):
         return len(self.stack) == 0 # if the stack ever equals zero we should return empty this can be done by taking the length of the stack
     def push(self, item):
         self.stack.append(item) # this will add the item as a element into our stack
     def pop(self):
       if self.isEmpty():
           raise Exception("Trying to remove from empty stack")
       return self.stack.pop() # removing top item in the stack
     def peek(self):
        if self.isEmpty():
            raise Exception("Trying to peek an empty stack")
        return self.stack[-1] # will show top of the stack 
     def size(self):
         return len(self.stack) # taking the length of the stack
     def show(self):
         return self.stack[:] # shallow copy of all elements in the stack


s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
