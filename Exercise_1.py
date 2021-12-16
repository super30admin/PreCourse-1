  #Exercise_1 : Implement Stack using Array.
  
  #Time Complexity : O(1) for all operations
  #Space Complexity : O(n) 
  #Did this code successfully run on VSCode : Yes
  #Any problem you faced while coding this : None

 
class myStack:

    def __init__(self):
      self.items = []   #constructor                    
         
    def isEmpty(self):
      return self.items == []   #testing to see if stack is empty and return boolean value
         
    def push(self, item):
      self.items.append(item)   #taking parameter as item. Returns nothing but modifies stack by appending item. 
         
    def pop(self):
      return self.items.pop()   #returns item being popped and modifies the stack
        
    def peek(self):
      return self.items[len(self.items)-1]  #returns only the top element without modifying the stack. Peeking into stack to just know what is the top element
        
    def size(self):
      return len(self.items)  #returning length of the array to know size of stack
         
    def show(self):
      return self.items   #returns the array itself 

s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())

