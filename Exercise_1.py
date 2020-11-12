class myStack:

     def __init__(self):
          self.new_stack = []
         
     def isEmpty(self):
          if self.new_stack == []:
               True
          else:
               False
         
     def push(self, item):
          self.new_stack.append(item)

     def pop(self):

          if self.new_stack != []:
               print(self.new_stack[-1])
               self.new_stack.pop(-1)
        
     def peek(self):
          if self.new_stack != []:
               self.new_stack[-1]
          else:
               None

     def size(self):
          print(len(self.new_stack))

     def show(self):
          print(self.new_stack)
         

s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
