class myStack:
  #Please read sample.java file before starting.
  #time complexity:O(1)
  #space complexity:O(n)
  #Kindly include Time and Space complexity at top of each file
     def __init__(self):
         self.items = []
     def isEmpty(self):
         return self.items == []
     def push(self, item):
        self.items.insert(0,item)
         
     def pop(self):
       return self.items.pop(0)
        
        
     def peek(self):
       return self.items[len(self.items)-1]
        
     def size(self):
       return len(self.items)
         
     def show(self):
       return self.items[len(self.items)-1]
         

s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
