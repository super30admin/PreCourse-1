""" 
Exercise_1 : Implement Stack using Array.

# Time Complexity :
- push(): O(1) amortized (append to end of list is amortized O(1))
- pop(): O(1)
- peek(): O(1)
- isEmpty(): O(1)
- size(): O(1)
- show(): O(1)

# Space Complexity :
- O(n) where n is the number of elements in the stack

# Did this code successfully run on Leetcode :
- Ran on my local machine, here's the output:

❯ python3 Exercise_1.py 
2
['1']

# Any problem you faced while coding this :

- No
"""

class myStack:
    
    def __init__(self):
        self.stack = []
         
    def isEmpty(self):
        return len(self.stack) == 0
         
    def push(self, item):
        self.stack.append(item)
         
    def pop(self):
        if not self.isEmpty():
            return self.stack.pop()
        return None  # Stack underflow case
        
    def peek(self):
        if not self.isEmpty():
            return self.stack[-1]
        return None  # Empty stack case
        
    def size(self):
        return len(self.stack)
         
    def show(self):
        return self.stack

# Test cases
s = myStack()
s.push('1')  
s.push('2')  
print(s.pop())    
print(s.show())  
