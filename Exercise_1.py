# Time Complexity : O[1]
# Space Complexity : O[1]
class myStack:
  #Please read sample.java file before starting.
  #Kindly include Time and Space complexity at top of each file
     def __init__(self):
      #  Initialize the list 
       self.stack = []

     def isEmpty(self):
      #  Check if the length of the list is 0
       return len(self.stack) == 0
         
     def push(self, item):
      #  Insert into the list at the end
       self.stack.append(item)

     def pop(self):
      #  If list is not empty then return the last element
       if not self.isEmpty(): 
        return self.stack.pop(len(self.stack) - 1)
       else:
         return -1
        
     def peek(self):
      #  if list is not empty then return the first element
        if not self.isEmpty():
          return self.stack[0]
        else:
          return -1

     def size(self):
       return len(self.stack)

     def show(self):
      #  show elements of the list
      return self.stack         

s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
