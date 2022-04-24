class myStack:
  #Please read sample.java file before starting.
  #Kindly include Time and Space complexity at top of each file
  from sys import maxsize
  def myStack(s):
       stack = []
       return stack
         
  def isEmpty(s):
         return (len(s) == 0)
  def push(s, item):
         s.append(item)
  def pop(s):
    if(isEmpty(s)):
      return str(-maxsize-1)
        return s.pop()
        
  def peek(self):
       if(isEmpty(s)):
       return str(-maxsize-1)
      return s[len(s)-1]
        
     def size(s):
         return len(s)
     def show(s):
       return s
     
         

s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
