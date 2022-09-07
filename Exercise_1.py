class myStack:
  #Please read sample.java file before starting.
  #Kindly include Time and Space complexity at top of each file
     def __init__(self):
          self.list = []
  
     def isEmpty(self):
          if len(self.list) == 0:
                return True
          else:
                return False

     def push(self, item):
         self.list.append(item)
     def pop(self):
        if self.isEmpty():
              return 'stack underflow'
        else:
              return self.list.pop()
        
     def peek(self):
        return self.list[-1]
     def size(self):
         return len(self.list)
     def show(self):
         return self.list

s = myStack()
s.push('1')
s.push('2')
s.push('3')
s.push('4')
print(s.pop())
print(s.show())
print(s.isEmpty())
print(s.peek())
print(s.size())