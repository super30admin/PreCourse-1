#time complexity : O(1)
#space complexity : O(n)
class myStack:
  #Please read sample.java file before starting.
  #Kindly include Time and Space complexity at top of each file
    def __init__(self):
       self.mystack=[]
         
    def isEmpty(self):
     return len(self.mystack)==0
         
    def push(self, item):
      self.mystack.append(item)
        
         
    def pop(self):
     if self.isEmpty():
       raise IndexError("Stack is underflow")
     return self.mystack.pop()
        
        
    def peek(self):
     if self.isEmpty():
       raise IndexError("stack is underflow")
     return self.mystack[-1]
       
        
    def size(self):
     return len(self.mystack)
         
    def show(self):
      if self.isEmpty():
        print("stack is underflow")
      else:
        print("Stack elements are:") 
        for item in reversed(self.mystack):
          print(item) 
         

s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
