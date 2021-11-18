class myStack:
  #Please read sample.java file before starting.
  #Kindly include Time and Space complexity at top of each file
     def __init__(self):
      self.stacklist = []     
     def isEmpty(self):
       if self.size == 0:
         return True
       return False
     def push(self, item):
       #  O (1)
      self.stacklist.append(item)    
     def pop(self):
       #  O (1)
        if self.size == 0:
          return "list is empty"
        else:
          return self.stacklist.pop()  
     def peek(self):
        return self.stacklist[-1]
     def size(self):
         return len(self.stacklist)
     def show(self):
        if self.isEmpty():
          return []  
        else:
          print(self.stacklist) 
s = myStack()
s.push('1')
s.push('2')
print(s.show())
print(s.pop())
print(s.show())
