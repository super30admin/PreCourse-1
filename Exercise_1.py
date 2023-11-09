#implementing stack using arrays(lists)
class myStack:
  # Time Complexity : O(1) for all functions
  # Space Complexity : O(n)
  # Did this code successfully run on Leetcode : N/A
  # Any problem you faced while coding this : None

     def __init__(self): # initialising the stack as empty List and top element as -1
         self.stack = []
         self.top = -1

     def isEmpty(self): # checking if the stack is empty by looking at top element
         self.top == 0

     def push(self, item): # incrementing the top by 1 and appending the stack with new item
         self.top += 1
         self.stack.append(item)

     def pop(self): # decrementing the top value and removing the top most element
        self.top -= 1
        return self.stack.pop()

     def peek(self): # returning the top most element
        return self.stack[self.top]

     def size(self): # returning the length of the stack
        return len(self.stack)

     def show(self): # returning the stack as a List
         return self.stack

s = myStack()
s.push('1')
s.push('2')
s.push('a')
s.push('b')
s.push('c')
s.push('d')
print(s.pop())
print(s.show())
