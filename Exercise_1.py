#implementing stack
class myStack:
     array=[]
     def __init__(self):
          self.array=[]
         
     def isEmpty(self):
          print(len(self.array)==0)
         
     def push(self, item):
          self.array.append(item)
         
     def pop(self):
          if len(self.array)==0:
             return ("No elements in the stack")
        else:
            return self.array.pop()
        
        
     def peek(self):
        if len(self.array)==0:
            return('Stack is Empty')
        else:
            return(self.array[len(self.array) - 1])

     def size(self):
           return len(self.array)
         
     def show(self):
          for i in self.array:
            return(i)


         

s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
