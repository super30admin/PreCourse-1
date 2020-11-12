class myStack:
     def __init__(self):
         self.items = []
     def isEmpty(self):
         flag = False
         if (len(self.items)==0):
             flag = True
         return flag

     def push(self, item):
         self.items.append(item)
         print("New item pushed", item)
          
     def pop(self):
         pos = len(self.items)
         self.items.pop(pos-1)
         print("One element has been poped from the stack")
        
        
     def peek(self):
         item = self.items[0]
         print("The topmost element in the Stack is:", item)
        
     def size(self):
         print("Size of the Stack is:", len(self.items))
         
     def show(self):
         print("Stack elements are:")
         print(self.items)
         

s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
