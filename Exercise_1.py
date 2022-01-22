#Time Complexity - O(n) for push, O(1) for peek/pop
#Space Complexity - O(1)


class myStack:
  #Please read sample.java file before starting.
  #Kindly include Time and Space complexity at top of each file
    def __init__(self):
      self.stack=[]

    def isEmpty(self):
      return self.stack==[]

    def push(self, item):
      self.stack.append(item)

    def pop(self):
      if(not self.isEmpty()):
        del(self.stack[-1])
      else:
        return "Stack is already empty"

        
    def peek(self):
      return self.stack[-1]

    def size(self):
      return len(self.stack)

    def show(self):
      return self.stack


s = myStack()
print(s.stack)
s.push('1')
s.push('2')
print(s.stack)
print(s.size())
s.pop()
print(s.show())
