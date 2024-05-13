class myStack:
    
  #Please read sample.java file before starting.
  #Kindly include Time and Space complexity at top of each file
    #Time Complexity: O(1)
    #space Complexity: O(n)
    #did this on leetcode 
    def __init__(self):
      self.stack=[]  # initializing array stack
          
         
    def isEmpty(self):
      if len(self.stack)==0: #checking if len=0 then it is empty
              
        return True
      else:
         return False
         
    def push(self, item):
      self.stack.append(item) #using append to add item to array
         
    def pop(self):
      if not self.isEmpty():  #checking if array is empty or not
        return self.stack.pop() #using array pop method
      else:
         return None
        
        
    def peek(self):
      if not self.isEmpty(): 
        return self.stack[-1]  #returning top element if array is not empty
      else:
        return None  # Stack is empty
        
        
    def size(self):

      return len(self.stack) #using len to get size of array
         
    def show(self):
        for s in self.stack:
            print(s)
         

s = myStack()
s.push('1')
s.push('2')
#print("1st show", s.show())
print(s.pop())
print(s.show())

