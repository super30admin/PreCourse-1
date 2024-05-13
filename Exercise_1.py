# The space complexity for a stack is O(n) where n is the number of elements in the stack.

# The time complexity for the push operation is O(1) on average, but can be O(n) in the worst case when resizing happens.
# The time complexity for the pop operation is O(1).
# The time complexity for the isEmpty operation is O(1).
# The time complexity for the peek operation is O(1).
# The time complexity for the size operation is O(1).
# The time complexity for the show operation is O(n) where n is the number of elements in the stack.

class myStack:
     def __init__(self):
         self.stack = []
     def isEmpty(self):
         return False if self.stack else True
     def push(self, item):
         self.stack.append(item)
     def pop(self):
         return self.stack.pop()
     def peek(self):
         return self.stack[-1]
     def size(self):
         return len(self.stack)
     def show(self):
         return (self.stack)

s = myStack()
s.push('1')
s.push('2')
print(s.peek())
print(s.isEmpty())
print(s.pop())
print(s.show())