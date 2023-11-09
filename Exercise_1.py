#Time complexity: everything is  O(1) 
#space complexity: O(1)
#Approach: used list for implementing stack
class myStack:
  

  def __init__(self):
    self.stack = [] #initialising stack using list
         
  def isEmpty(self):
    return len(self.stack)==0 #checked if length of the list is 0

         
  def push(self, item):
    return self.stack.append(item) #inserted the value at the end of the list.
         
  def pop(self):
    if self.isEmpty():
      print("stack is empty")
    else:
      return self.stack.pop() # deleting the value at the end of the list
      

        
        
  def peek(self):
    return self.stack[-1] # getting the value at the end of the list(top)
        
  def size(self):
    return len(self.stack) # length of the list
         
  def show(self):
    return self.stack #entire list
         

s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
