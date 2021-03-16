class myStack:
     def __init__(self):
          self.stack_list = []
          self.count = 0
         
     def isEmpty(self):
          return True if self.count else False
         
     def push(self, item):
          self.count += 1
          self.stack_list.append(item) 
         
     def pop(self):
          if not self.count:
               return None
          self.count -= 1
          return self.stack_list.pop()
        
        
     def peek(self):
          if not self.count:
               return None
          return self.stack_list[-1]
        
     def size(self):
          return self.count
         
     def show(self):
          return self.stack_list
         

s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
