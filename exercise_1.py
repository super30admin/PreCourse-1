class stack():
   def __init__(self):
     self.data=[]
  
   def push(self,value):
     self.data.append(value)
  
   def pop(self):
    if len(self.data) is 0:
        print("list is empty cannot pop")
    else:
        print(self.data.pop())
  
   def len(self):
   	print("length is:" + str(len(self.data)))
  
   def isempty(self):
    if len(self.data) is 0:
    	print("stack is empty")
        return True
    else:
    	print("stack is not empty")
        return False
  
   def top(self):
    if len==0:
       print("list is empty")
    else:
       print("Fisrt element is:" + str(self.data[-1]))

   def printstack(self):
   	  for num in self.data:
   	  	print(num)

s=stack()
s.isempty()
s.pop()
s.push(10)
s.push(20)
s.isempty()
s.push(30)
s.pop()
s.push(60)
s.len()
s.top()
s.printstack()




