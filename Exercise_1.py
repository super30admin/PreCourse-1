# Time Complexity :O(1) for all the methods 
# Space Complexity : O(N) where N is the size of the stack
# Did this code successfully run on Leetcode : I tried in VS code 
# Any problem you faced while coding this :No


# Your code here along with comments explaining your approach
# In __init__ method I am intializing an array named stack to store the elements
# In isEmpty I am check the if stack is not empty if not then return True 
# In push I am adding the element to the top of the stack
# In pop I am first checking if the stack is empty or not if not then removing the element from the top of the stack
# In peek I am checking if the stack is empty or not if not then returning the element at the top of the stack
# In size I am returning the size of the stack
class myStack:
    def __init__(self):
         self.stack = []
         
    def isEmpty(self):
        if not self.stack:
            return True
        return False
    def push(self, item):
        self.stack.append(item)
        return self.stack 
    def pop(self):
        if not self.stack:
            return None
        self.stack.pop()
        return self.stack
    def peek(self):
        if not self.stack:
            return None
        return self.stack[-1]
    def size(self):
         return len(self.stack)
    def show(self):
         return self.stack

s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())