class myStack:
     def __init__(self):

         self.stack=[]

     def isEmpty(self):

        if len(self.stack)==0:
             return True
        else:
             return False

     def push(self, item):

         self.stack.append(item)

     def pop(self):

         if not self.stack:
             print('Stack is empty')
         else:
             return self.stack.pop()

     def peek(self):

         if not self.stack:
             print('Stack is empty')
         else:
             return self.stack[-1]

     def size(self):
         return len(self.stack)

     def show(self):
         print(self.stack)


s = myStack()
s.push('1')
s.push('2')
print(s.peek())
print(s.isEmpty())
