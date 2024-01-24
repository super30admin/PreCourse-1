# Time complexity = O(1) for push, pop and peek.
# Space complexity =  O(n)



class myStack:
  #Please read sample.java file before starting.
  #Kindly include Time and Space complexity at top of each file
     def __init__(self):
          self.length = 0
          self.data = {}
         
     def isEmpty(self):
          if self.length == 0:
               return None
         
     def push(self, item):
          self.data[self.length] = item
          self.length += 1

          return self.length

         
     def pop(self):
          if self.length == 0:
               return None
          
          popped_item = self.data[self.length -1]
          self.data[self.length -1] = None
          self.length -= 1

          return popped_item
        
        
     def peek(self, index):
          return self.data[index]

      
     def size(self):
          return (self.length[self.data])

         
     def show(self):
          for element in self.data:
               print(element)



         

s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
