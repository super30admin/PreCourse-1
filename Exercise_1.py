#Implement Stack using Array
class myStack:
     def __init__(self):
       self.l=[]
         
     def isEmpty(self):
      if self.size()==0:
         return True
      else:
          return False
         
     def push(self, item):
       self.l.append(item)

         
     def pop(self):
        if self.size()==0:
          print("Stack Empty")
        else:
          return self.l.pop()

        
     def peek(self):
       return self.l[-1]
        
     def size(self):
       return len(self.l)
         
     def show(self):
       return self.l
         

s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())