# Time Complexity :
# Space Complexity :
# Did this code successfully run on Leetcode :
# Any problem you faced while coding this :


class myStack:
 
    # default constructor
    def __init__(self):
        self.stack = []
 
    # a method for printing data members
    def isEmpty(self):
        return True if len(self.stack)==0 else False
    
    def push(self, item):
        self.stack.append(item)
    
    def pop(self):
        item = self.stack[-1]
        self.stack = self.stack[:len(self.stack) - 1]
        return item

    
    def peek(self):
        return self.stack[-1]
    
    def size(self):
        return len(self.stack)
    
    def show(self):
        return self.stack


s = myStack()
s.push('1')
print(s.show())
s.push('2')
print(s.pop())
print(s.show())