#Exercise_1 : Implement Stack using Array.
#space = O(n) -- space occupied by the elements
#time for push, peek, size, isEmpty is O(1)
#time for  show is O(n)
class myStack:
  #Please read sample.java file before starting.
  #Kindly include Time and Space complexity at top of each file

     def __init__(self):
          self.array = []
         
     def isEmpty(self):
          return not any(self.array)
         
     def push(self, item):
          self.array.append(item)
         
     def pop(self):
          if self.array:
            return self.array.pop(0)
    
     def peek(self):
          if self.array:
               return self.array[0]
        
     def size(self):
          return len(self.array)
         
     def show(self):
          return self.array
         

s = myStack()
print(s.isEmpty())
s.push('1')
s.push('2')
s.push('3')
s.push('4')
print(s.show())
print(s.pop())
print(s.show())
print(s.size())
print(s.peek())
print(s.isEmpty())
