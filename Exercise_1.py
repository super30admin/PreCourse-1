class myStack:

   # Time complexity for :
   # push operation = O(1)
   # pop operation = O(1)
   # peek operation = O(1)

   # Space complexity = O(n)

   def __init__(self):
      self.stack = []
      self.maxSize = 1000
      # self.top = -1

   def isEmpty(self):
      return self.stack == []

   def push(self, item):
      self.stack.append(item)
      # self.top += 1

   def pop(self):
      if self.isEmpty():
         return "Stack is empty!"
      else:
         last_element = self.stack[-1]  # saving last
         del self.stack[-1]  # removing last
         # self.top = self.top - 1
         return last_element

   def peek(self):
      if self.isEmpty():
         return "Stack is empty!"
      else:
         return self.stack[-1]

   def size(self):
      return len(self.stack)

   def show(self):
      return self.stack


# Driver Code
if __name__ == '__main__':
   s = myStack()

   s.push(1)
   print('element pushed: 1')  # Inserting 1 in the stack
   s.push(2)  # Inserting 2 in the stack
   print('element pushed: 2')
   s.push(3)  # Inserting 3 in the stack
   print('element pushed: 3')
   print(s)
   print('size is', s.size())
   print('Top element is', s.peek())
   print(s.show())

   print('element removed:', s.pop())  # removing the top element (2)
   s.pop()  # removing the top element (1)

   print('Top element is', s.peek())
   print('The stack size is', s.size())

   s.pop()  # removing the top element (3)

   # check if the stack is empty
   if s.isEmpty():
      print('The stack is empty')
   else:
      print('The stack is not empty')

s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
