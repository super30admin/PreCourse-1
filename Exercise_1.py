class myStack:
  #Please read sample.java file before starting.
  #Kindly include Time and Space complexity at top of each file
  #TC = O(1)
  #SC = O(n)

    def __init__(self, total_size):
      self.stack = []
      self.total_size = total_size

    def isEmpty(self):
      return len(self.stack) == 0
     
    def isFull(self):
      return len(self.stack) == self.total_size
     
    def push(self, item):
      if self.isFull():
        print("Stack Overflow")
      else: 
        self.stack.append(item)
        print(item + " pushed to stack ")

    def pop(self):
      if self.isEmpty():
        print("Stack underflow")
        return 0
      return self.stack.pop()
     
    def peek(self):
        if self.isEmpty():
          return 0
        return self.stack[len(self.stack) - 1]
        
    def size(self):
      return len(self.stack)
     
    def show(self):
      return self.stack

s = myStack(2)
s.push('1')
s.push('2')
s.push('3')
print(s.peek())
print(s.size())
print(s.pop())
print(s.pop())
print(s.pop())
print(s.show())
