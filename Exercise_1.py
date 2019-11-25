
# PreCourse_1: Exercise_1 : Implement Stack using Array.
# Stack is Last-In-First-Out

class myStack:
     def __init__(self):
          self.items = []
         
     def isEmpty(self):
          return self.items == []
         
     def push(self, item):
          self.items.append(item)
         
     def pop(self):
          return self.items.pop()
        
     def peek(self):
          return self.items[len(self.items)-1]
        
     def size(self):
          return len(self.items)
         
     def show(self):
          return self.items

         

s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
