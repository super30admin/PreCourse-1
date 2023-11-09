from xml.etree.ElementTree import iselement
class myStack:
  #Please read sample.java file before starting.
  #Kindly include Time and Space complexity at top of each file
     def __init__(self):
       self.arr=[]
     
     def isEmpty(self):
       return len(self.arr)==0
         
     def push(self, item):
       self.arr.append(item)
        
     def pop(self):
       if len(self.arr)==0:
         print("Stack underflow")
         return 0
       remove_item=self.arr[-1]
       del self.arr[-1]
       return remove_item
          
     def peek(self):
       if len(self.arr)!=0:
         return self.arr[-1]
              
     def size(self):
       return len(self.arr)
         
     def show(self):
       if len(self.arr)==0:
         return print("Empty Stack!!") 
       return self.arr        
         

s = myStack()
print("isEmpty =", s.isEmpty())
s.push('1')
s.push('2')
print("show=", s.show())
print("peek = ",s.peek())
print("pop=", s.pop())
print("show=", s.show())
print("pop=", s.pop())
print("show=", s.show())
