class myStack:
     #// Time Complexity : 
     # isEmpty: O(1)
     # push: O(1)
     # pop: O(1)
     # peek: O(1)
     # size: O(1)
     # show: O(n)
     #// Space Complexity :O(n)
     #// Did this code successfully run on Leetcode :
     #// Any problem you faced while coding this :None

  #Please read sample.java file before starting.
  #Kindly include Time and Space complexity at top of each file
     def __init__(self):
         self.stack=[]

     def isEmpty(self):
          return len(self.stack) == 0
         
     def push(self, item):
          self.stack.append(item)
          print(item + " pushed to stack")
         
     def pop(self):
          if(self.isEmpty()):
               raise IndexError("pop from an empty stack")
          item=self.stack.pop()
          print(item + " popped from stack")
          return item
        
        
     def peek(self):
          if(self.isEmpty()):
               raise IndexError("peek from an empty stack")
          return self.stack[-1]
          
        
     def size(self):
          return len(self.stack)
         
     def show(self):
          return self.stack
     
if __name__ == "__main__":
  s = myStack()
  s.push('1')
  s.push('2')
  print(s.pop())
  print(s.show())
