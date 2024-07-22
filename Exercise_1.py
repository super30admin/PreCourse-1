class myStack:
  # Please read sample.java file before starting.
  # Kindly include Time and Space complexity at top of each file
  # FILO - first in last out

    def __init__(self):
      self.size = 0
      self.stack = []

    def isEmpty(self):
      return self.size == 0

    def push(self, item):
      print("### PUSH ###")
      self.stack.append(item)
      self.size += 1

    def pop(self):
      print("### POP ###")
      if not self.isEmpty():
        self.size -= 1
        return self.stack[-1]
      return None
      
    def peek(self):
      print("### PEEK ###")
      if not self.isEmpty():
        return self.stack[-1]
      return None

    def size(self):
      return self.size 

    def show(self):
      stack = ""
      for ele in range(self.size):
        stack += self.stack[ele] + " "
      return stack

s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
