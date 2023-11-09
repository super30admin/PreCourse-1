from collections import deque
# Time complexity: O(1) for all the stack operations as deque is used
# If list would have been used it would be O(n)
# Space Complexity: O(n); n is the size of the stack
class myStack:
     stack = deque()
  #Please read sample.java file before starting.
  #Kindly include Time and Space complexity at top of each file
     def __init__(self):
        pass

     def isEmpty(self):
        return len(self.stack) == 0
         
     def push(self, item):
        self.stack.append(item)

     def pop(self):
         return self.stack.pop()

     def peek(self):
         return self.stack[-1]

        
     def size(self):
        return len(self.stack)
         
     def show(self):
        return self.stack
         

s = myStack()
print("isEmpty before pushing:")
print(s.isEmpty())
s.push('1')
s.push('2')
s.push('5')
s.push('4')
print("isEmpty after pushing:")
print(s.isEmpty())
print("pop:")
print(s.pop())
print("display:")
print(s.show())
print("size:")
print(s.size())
print("peek:")
print(s.peek())
