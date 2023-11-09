# Time Complexity : O(1) for push,pop,peek 
# Space Complexity : O(n) for appending
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : N0
class myStack:
  #Please read sample.java file before starting.
  #Kindly include Time and Space complexity at top of each file
     def __init__(self):
       self.item=[]

     def isEmpty(self):
       if self.item==[]:
         return True
       else:
         return False
         
     def push(self, item):
       self.item.append(item)
       pass
       
         
     def pop(self):
       self.item.pop()
       pass
        
        
     def peek(self):
       if self.item:
         return self.item[-1]
       else:
         return None

      
        
     def size(self):
       if self.item:
         return len(self.item)
       else:
         return None

         
     def show(self):
       print(self.item)
         

s = myStack()
s.push('1')
s.push('2')
print(s.show())
print(s.size())
print(s.peek())
print(s.pop())
print(s.size())
print(s.peek())
print(s.isEmpty())

print(s.show())
