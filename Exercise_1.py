class myStack:
     def __init__(self):
         self.arr=[]
     
     
     def isEmpty(self):
          if self.arr==[]:
              return True
          else:
               return False
     def push(self, item):
          self.arr.append(item)
         
     def pop(self):
          if s.isEmpty():
               return 'Nothing in the Stack'
          return self.arr.pop()
        
     def peek(self):
          if s.isEmpty():
               return 'Nothing in stack'
          return self.arr[-1]

     def size(self):
        return len(self.arr) 

     def show(self):
          return self.arr
          
s = myStack()
s.push('1')
s.push('2')
s.push('100')
s.pop()
s.pop()
s.pop()
s.pop()
print(s.show())
print(s.peek())
