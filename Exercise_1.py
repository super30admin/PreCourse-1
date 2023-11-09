# Time Complexity :O(n)
# Space Complexity :O(n)
# Did this code successfully run on Leetcode : NA
# Any problem you faced while coding this : NO


class myStack:
  #Please read sample.java file before starting.
  #Kindly include Time and Space complexity at top of each file
  def __init__(self):
    self.stack=[]  #Creating a List for StacK 
      
  def isEmpty(self):
    return(self.stack==[]) #Checking if the Stack/List is empty
         
  def push(self, item):
    self.stack.append(item) #Appending Element to end of List/Top of Stack
         
  def pop(self):
    popped_item=self.stack[-1] #Storing the Popped Element ; Element top of Stack / End of List
    self.stack=self.stack[:-1] #Re-assigning Stack without the Top Element
    return(popped_item)        # Returning the Popped Element

        
  def peek(self):
    return(self.stack[-1]) #Returning Top of Stack
        
  def size(self):
    return(len(self.stack)) # Returming number of ELements in the Stack
         
  def show(self):
    return(self.stack) #Returning the Stack
         

s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
