class myStack:
  # Time Complexity : 
#   push()    -> O(1)
#   pop()     -> O(1)
#   peek()    -> O(1)
#   isEmpty() -> O(1)
#   show()    -> O(n)
# Space Complexity :  O(n)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this :  No problems faced. Just had to remember that Python lists don't have isEmpty(), so used custom method
     def __init__(self):
        self.s = []
     def isEmpty(self):
        return  len(self.s) == 0 
         
     def push(self, item):
        self.s.append(item)
     def pop(self):
        if not self.isEmpty():
            return self.s.pop()
        else:
            return 'Stack is empty'
     def peek(self):
        if not self.s.isEmpty():
            return self.s[-1]
        else:
            return 'Stack is empty'
     def size(self):
         return len(self.s)
     def show(self):
         return "stack contents" + str(self.s)

s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
