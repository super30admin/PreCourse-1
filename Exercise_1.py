class myStack:
     stack=[]
     max = 1000
     def __init__(self):
          
          self.stack = []
         
     def isEmpty(self):
          if len(self.stack)== 0:
               print (True)
          else:
               print (False)
         
     def push(self, item):
          if len(self.stack)>1000:
               print("Stack Overflow.Cannot push item into stack .") 
          self.stack.append(item)
         
     def pop(self):
          if(len(self.stack)==0):
             print("Stack Underflow")
          self.stack.pop()
          print("The last item is remooved "+str(self.stack.pop()))  
        
     def peek(self):
          if (len(self.stack)==0):
               print("Stack Underflow")
          print( self.stack[len(self.stack)-1])
        
     def size(self):
          print(len(self.stack))
         
     def show(self):
         for i in self.stack:
              print(i)

s = myStack()
s.push(1)
s.push(2)
s.push(3)
s.peek()
s.pop()
s.show()
