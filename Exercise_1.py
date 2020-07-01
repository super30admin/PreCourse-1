class myStack:
     def __init__(self):
        # initialize stack using list
         self.stack=[]

     def isEmpty(self):
         if len(self.stack)==0: return True
         else: return False

     def push(self, item):
         # append item to the list
         self.stack.append(item)

     def pop(self):
        if self.isEmpty():
            print('Message: Stack is empty')
            return None
        else:
            return self.stack.pop(-1)
        
        
     def peek(self):
         if self.isEmpty():
             print('Message: Stack is empty')
             return None
         else:
             return self.stack[-1]

     def size(self):
         if self.isEmpty():
             print('Message: Stack is empty')
             return 0
         else:
             return len(self.stack)

     def show(self):
         # return whole list
         return self.stack
         

s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
