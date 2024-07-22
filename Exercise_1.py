class myStack:
  #Please read sample.java file before starting.
  #Kindly include Time and Space complexity at top of each file
  # O(n) time complexity for show and for the rest operations O(1)
  # O(n) space comlexity
     def __init__(self):
      sel.stack=[]
         
     def isEmpty(self):
      return len(self.stack)==0
         
     def push(self, item):
      self.stack.append(item)
         
     def pop(self):
      if not isEmpty():
        return self.stack.pop()
      else:
        return None 

     def peek(self):
      if not isEmpty():
        return self.stack[-1]
      else:
        return None
        
     def size(self):
      return len(self.stack)
         
     def show(self):
      return self.stack
         

s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
