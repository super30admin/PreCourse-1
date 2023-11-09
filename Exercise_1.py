# Executed Successfully
# Time: Pop O(1)
# Space: O(n)
class myStack:

     def __init__(self):
         self.stack = []
        
     def isEmpty(self):
        if len(self.stack) <= 0:
            return True
        else:
            return False
         
     def push(self, item):
        self.stack.append(item)
         
     def peek(self):
       return self.stack[-1]
       
     def pop(self):
        return self.stack.pop() if not self.isEmpty() else "Empty Stack"
    
    
        
     def size(self):
        return len(self.stack)
         
     def show(self):
        return (self.stack)
         

s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
