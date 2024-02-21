# Time Complexity : O(1)
# Space Complexity : O(n)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

# Your code here along with comments explaining your approach
class myStack:
     def __init__(self):
      self.data = []

     #Checking if stack is Empty or not, by checking the length of stack    
     def isEmpty(self):
        return len(self.data) == 0
     
      # adding element, by using append operation    
     def push(self, item):
        self.data.append(item)

      # remove element, by using pop operation  
     def pop(self):
        if self.isEmpty():
           return
        return self.data.pop()
        
      #find top element  
     def peek(self):
        return self.data[-1]

      #size   
     def size(self):
        return len(self.data)

      #show element   
     def show(self):
        return self.data
         

s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
