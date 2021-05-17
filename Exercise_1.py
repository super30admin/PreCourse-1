class myStack:
     def __init__(self):
          self.arr = []
         
     def isEmpty(self):
          return len(self.size()) == 0
     def push(self, item):
         self.arr.append(item)
     def pop(self):
          if self.size() == 0 :
               print("Pop: Empty Stack")
               return None
          return self.arr.pop()
        
     def peek(self):
          return self.arr[self.size()-1]
        
     def size(self):
          return len(self.arr)
         
     def show(self):
          if self.size == 0:
               print("Show: Empty Stack")
          return self.arr[::-1]
         

s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
