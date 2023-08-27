class myStack:
  #Please read sample.java file before starting.
  #Kindly include Time and Space complexity at top of each file

     def __init__(self):
          self.input = []
          #top = -1
         
     def isEmpty(self):
          return self.input.isEmpty()
         
     def push(self, item):
          self.input.append(item)
          # self.top+=1
          # self.input[self.top] = item

     def pop(self):
          return self.input.pop()
               
        
     def peek(self):
          return self.input[len(self.input)-1]
        
     def size(self):
          return len(self.input)
         
     def show(self):
          print(self.input)
         

s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
