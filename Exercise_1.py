class myStack:
  #Please read sample.java file before starting.
  #Kindly include Time and Space complexity at top of each file
     def __init__(self):
         self.array=[]
     def isEmpty(self):
       if len(self.array)==0:
         return True
       else:
         return False
     def push(self, item):
       self.item=item
       self.array.append(item)
     def pop(self):
       if(self.isEmpty()):
         print("stack empty")
       else:
         print("popped", self.array[-1])
         self.array=self.array[:-1]
     def peek(self):
       print(self.array[-1])
     def size(self):
       print(len(self.array))
     def show(self):
       print(self.array)
         

s = myStack()
s.push('1')
s.push('2')
s.push('4')
s.show()
s.peek()
s.size()
s.pop()
s.show()


