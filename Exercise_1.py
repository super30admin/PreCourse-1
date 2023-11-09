class myStack:
  #Please read sample.java file before starting.
  #Kindly include Time and Space complexity at top of each file
     def __init__(self):
       self.stack=[]
         
     def isEmpty(self):
       return self.stack==[]
         
     def push(self, item):
       self.stack.append(item)
         
     def pop(self):
       if(not self.isEmpty()):
            lastElement = self.stack[-1] #Save the last element to return
            del(self.stack[-1]) #Remove the last element
            return lastElement
       else:
         return("Stack Already Empty")
 
     def peek(self):
       return self.stack[0]

     def size(self):
       return len(self.stack)

     def show(self):
       print(self.stack)
         

s = myStack()
s.push('1')
s.push('2')
s.push('3')
s.push('4')
s.push('5')
print(s.pop())
print(s.show())
print(s.isEmpty())
print(s.peek())
print(s.size())
