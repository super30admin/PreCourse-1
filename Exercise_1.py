#Time complexity for this program is O(1) and for show() it will O(n)
#Space complexity for this program is O(n) and n is the number of elements in the stack

class myStack:
  #Please read sample.java file before starting.
  #Kindly include Time and Space complexity at top of each file
     def __init__(self):
          self.stack = []
          self.top = -1
         
     def isEmpty(self):
          return self.top == -1
         
     def push(self, item):
          self.top +=1
          self.stack.append(it)         
     def pop(self):
          if self.isEmpty():
               print("Stack is empty")
               return None
          item = self.stack[self.top]
          self.top -= 1
          return item
               
        
        
     def peek(self):
          if self.isEmpty():
               print("Stack is empty")
               return None
          return self.stack[self.top]
        
     def size(self):
         return self.top + 1
     def show(self):
          if self.isEmpty():
               print("Stack is empty: Nothing to show.")
               return []
          return self.stack[:self.top + 1]
          

s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
