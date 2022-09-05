# Time Complexity : push - O(1), pop - O(1)
# Space Complexity : push - O(1), pop - O(1)
class myStack:
  #Please read sample.java file before starting.
  #Kindly include Time and Space complexity at top of each file
  def __init__(self):
    self.stack = []

  def isEmpty(self):
    return len(self.stack) == 0   
  
  def push(self, item):
    #append item to the top of the stack
    self.stack.append(item)

  def pop(self):
    #remove topmost element of the stack
    if (not self.isEmpty()):
      top = self.stack[-1]
      del(self.stack[-1])
      return top
    else:
      return ("Stack is empty")
        
  def peek(self):
    #return top of the stack
    return self.stack[-1] 
        
  def size(self):
    return len(self.stack)
         
  def show(self):
    return self.stack
         

s = myStack()

s.push('1')
s.push('2')
s.push('3')
s.push('4')
s.push('5')

print(s.peek())
print(s.show()) 



print(s.pop())
print(s.show()) 
print(s.pop())
print(s.pop())
print(s.pop())
print(s.pop())
print(s.pop())

print(s.show()) 
