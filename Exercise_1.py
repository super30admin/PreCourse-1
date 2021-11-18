class myStack:
    # Time Complexity :
    # Space Complexity :
    # Did this code successfully run on Leetcode : Yes
    # Any problem you faced while coding this :


    
  #Please read sample.java file before starting.
  #Kindly include Time and Space complexity at top of each file
    def __init__(self):
        
        self.list1 = []
         
    def isEmpty(self):
        if len(self.list1) == 0:
             return True
        else:
            return False
         
    def push(self, item):
        self.list1.append(item)
       
    def pop(self):
        if self.size == 0:
             return "Stack is empty"
        else:
            return self.list1.pop()
        
    def peek(self):
        return self.list1[-1]
        
    def size(self):
         return len(self.list1)
        
    def show(self):
        for i in range(len(self.list1)):
            print(self.list1[i])
        
         

s = myStack()
s.push('1')
s.push('2')
print(s.pop())
