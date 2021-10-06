class myStack:
  #Please read sample.java file before starting.
  #Kindly include Time and Space complexity at top of each file
     def __init__(self):
       self.items = []
         
     def isEmpty(self):
        if self.size == 0:
          return True
        return False
         
     def push(self, item):
       self.items.append(item)
         
     def pop(self):
        if self.isEmpty():
          print("Stack Overflow") 
          return 0
        else:
          return self.items.pop()  
        
     def peek(self):
        return self.items[-1]
        
     def size(self):
        return len(self.items)
         
     def show(self):
        print(self.items[::-1])


s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
