# Time complexity
# Push/Pop/Peek -> O(1) since we are accessing it using direct index and show O(N)
# Space Complexity -> push, pop/peek (O(1))
class myStack:
  #Please read sample.java file before starting.
  #Kindly include Time and Space complexity at top of each file
     def __init__(self):
      self.data = []
      self.counter = 0
         
     def isEmpty(self):
        return self.counter == 0
         
     def push(self, item):
        self.data.append(item)
        self.counter += 1

         
     def pop(self):
        if self.isEmpty():
           return IndexError("Stack is Empty. Nothing to pop")
        item = self.data[self.counter-1]
        self.counter -=1 
        return item
        
        
     def peek(self):
        if self.isEmpty:
           return IndexError("Stack is Empty nothing to peek")
        return self.data[self.counter-1]
        
        
     def size(self):
        return self.counter
         
     def show(self):
        for i in range(self.counter):
           print(self.data[i])
         

s = myStack()
s.push('1')
s.push('2')
print(s.pop())
s.show()
