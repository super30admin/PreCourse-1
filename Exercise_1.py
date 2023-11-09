class CustomException(Exception):
    def __init__(self, message="Push something in the stack"):
        self.message = message
        super().__init__(self.message)        
class myStack:
  def __init__(self):
      self.stack = []
  def isEmpty(self):
      return self.stack == []
  def push(self, item):
      self.stack.append(item)
  def pop(self):
    if (not self.isEmpty()):
        lastElement = self.stack[-1]
        del(self.stack[-1])
        return lastElement
    else:        
        raise CustomException("Push something before you pop")
  def peek(self):
    if (not self.isEmpty()):
        return self.stack[-1]
    else:
        raise CustomException()
  def size(self):
      return len(self.stack)
  def show(self):
      print(self.stack)

s = myStack()
try:
    s.push('1')
    print(s.size())
    s.push('2')
    print(s.pop())
    print(s.show())    
    print(s.peek())
    print(s.pop())
    print(s.peek())
except CustomException as ce:
    print(ce)    
    
