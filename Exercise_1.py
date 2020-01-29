class myStack:
     def __init__(self):
          self.l = []

     def isEmpty(self):
          '''
          Check if length is 0 and return True or False accordingly
          '''
          return len(self.l) == 0

     def push(self, item):
          '''
          Add item to stack
          '''

          self.l.append(item)

     def pop(self):
          '''
           Check if stack is empty and print Underflow else pop the last item
          '''

          if self.isEmpty():
               print("Stack Underflow")
               return 0
          else:
               return self.l.pop()
        
     def peek(self):
          '''
          Check if Stack is empty and print Stack Empty else
          return the last item without removing it from stack
          '''

          if self.isEmpty():
               print("Stack Empty")
               return -1
          else:
               return self.l[-1]

     def size(self):
          '''
          Return the size of the array
          '''

          return len(self.l)

     def show(self):
          '''
          Return the complete array
          '''

          return self.l
         

s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
