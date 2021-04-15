class myStack:
     def __init__(self):
          # Stack as an array
          self.stack = []

     def isEmpty(self):
          # check if stack length is 0
          return len(self.stack) == 0
         
     def push(self, item):
          # add the element at the end of the stack
          self.stack.append(item)
         
     def pop(self):
          if len(self.stack) > 0:
               return self.stack.pop()
          else:
               print("Nothing to pop as the stack is empty")
        
     def peek(self):
          # last element in the array is the top of the stack
         return self.stack[-1]
        
     def size(self):
          # returning the length of the stack
         return len(self.stack)

     def show(self):
          # only if the stack exists, we print its contents
          if self.stack:
               print(self.stack)
         

s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())


'''
Output - As executed in PyCharm IDE

2
['1']
None

'''