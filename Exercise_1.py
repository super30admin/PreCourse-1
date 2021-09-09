"""
Time complexity: 
pop - O(1)
push - O(1)
isEampty - O(1)
peek - O(1)
show - O(n)

Space Complexity:
O(n) for every thing

"""

class myStack:
  #Please read sample.java file before starting.
  #Kindly include Time and Space complexity at top of each file
    def __init__(self):
      self.stack = []
      self.top = 1000
    def isEmpty(self):
        if len(self.stack) == 0:
          return True
        else:
          return False

    def push(self, item):
      if len(self.stack) < self.top:
        self.stack.append(item)
      else:
        print("The stack is full")
         
    def pop(self):
      if len(self.stack) != 0:
        self.stack.pop(-1)
      else:
        print("The list is already empty")

        
    def peek(self):
      if len(self.stack) != 0:
        print(self.stack[-1])
      else:
        print("This is an empty stack")
        
    def size(self):
      print(len(self.stack))
         
    def show(self):
      print(self.stack)
         

s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
