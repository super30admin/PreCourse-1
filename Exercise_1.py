class myStack:

     def __init__(self):

          self.stack = []
         
     def isEmpty(self):

          if(len(self.stack)==0):
               print "Stack is empty"
          else:
               print "stack is not empty"
         
     def push(self, item):

          self.stack.append(item)
         
     def pop(self):

          print "popped element :",self.stack.pop()
        
     def peek(self):

          if (self.stack == []):
               print "stack is empty"
          else:
               print self.stack[-1]
        
     def size(self):

         length = len(self.stack)
         print "size of list :",length
         
     def show(self):

         print self.stack

s = myStack()
s.push('1')
s.push('2')
s.push('3')
s.push('4')
s.show()
s.pop()
s.show()
s.size()
s.peek()
s.isEmpty()
