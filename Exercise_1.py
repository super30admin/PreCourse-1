'''
Implement Stack using Array
'''
class myStack:
     def __init__(self):
          self.stack = []
          self.length = 1000
     
     '''
     isEmpty()
     Time complexity:  O(1)
     Space complexity: O(1)
     '''
     def isEmpty(self):
          return not self.stack
     
     '''
     push()
     Time complexity:  O(1)
     Space complexity: O(1)
     '''
     def push(self, item):
          return self.stack.append(item) if self.size() < 1000 else "Stack Overflow"
     
     
     '''
     pop()
     Time complexity:  O(N)
     Space complexity: O(N)
     '''
     def pop(self):
          return self.stack.pop() if self.stack else "Stack Underflow"
     
     '''
     peek()
     Time complexity:  O(1)
     Space complexity: O(1)
     '''
     def peek(self):
          return self.stack[-1] if self.stack else "Stack Underflow"
     
     '''
     size()
     Time complexity:  O(1)
     Space complexity: O(1)
     '''
     def size(self):
          return len(self.stack)
     
     '''
     show()
     Time complexity:  O(1)
     Space complexity: O(1)
     '''         
     def show(self):
          return self.stack
         
s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
