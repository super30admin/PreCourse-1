class myStack:
     def __init__(self):
          self.stack = []
         
     def isEmpty(self):
          #check if stack is empty or not : O(1)
          if not self.stack:
               return True
          return False
         
     def push(self, item):
          #push an element in the stack : O(1)
          self.stack.append(item)
         
     def pop(self):
          # remove top element : O(n) - n: no.of elements
          if self.isEmpty():
             return -1
          pop_ele = self.peek()
          self.stack = self.stack[:self.size()-1]
          return pop_ele

        
     def peek(self):
          # fetch top of the stack: O(1)
          if self.isEmpty():
             return None
          else:
             return self.stack[-1]
        
     def size(self):
          # return size of stack : O(1)
          return len(self.stack)
         
     def show(self):
          # print stack : O(1)
          return self.stack
         

s = myStack()
s.push('1')
s.push('2')
print(s.size())
print(s.show())
print(s.peek())
print(s.pop())
print(s.show())
