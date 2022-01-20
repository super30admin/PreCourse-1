// Time Complexity : 0(1)  for all functions except show which has complexity 0(n)
// Space Complexity : O(n) where n is no of elements
// Did this code successfully run on Leetcode : ran it on vs code ide
// Any problem you faced while coding this : no










class myStack:
  #Please read sample.java file before starting.
  #Kindly include Time and Space complexity at top of each file
     def __init__(self):
       self.myList=[]
         
     def isEmpty(self):
        return len(self.myList==0)
     def push(self, item):
       self.myList.append(item)
         
     def pop(self):
        if len(self.myList)==0:
            return None
        else:
            return self.myList.pop()
        
     def peek(self):
         if len(self.myList)==0:
            return None
         else:
            return self.myList[-1]
            
        
     def size(self):
       return len(myList)
         
     def show(self):
       return self.myList
         

s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
        
