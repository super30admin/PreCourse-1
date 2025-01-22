'''
Time Complexity :
isEmpty : O(1)
push : O(1)
pop : O(1)
peek : O(1)
size : O(1)
show : O(n)

// Space Complexity : O(n)
// Did this code successfully run on Leetcode : I dont know
// Any problem you faced while coding this : No

'''
class myStack:
  #Please read sample.java file before starting.
  #Kindly include Time and Space complexity at top of each file
     def __init__(self):
      #Initialize the stack
      self.s=[]
         
     def isEmpty(self):
      #check if empty, otherwise return False
      if not self.s:
        return True
      return False
         
     def push(self, item):
      #push an item into the stack
      self.s.append(item)
         
     def pop(self):
      #check if stack is empty
      if not self.s:
        print('List is empty')
        return
      item=self.s[-1]
      self.s=self.s[:-1]
      return item
        
        
     def peek(self):
      #look at the top of the stack
      if not self.s:
        print('List is empty')
        return
      print(self.s[-1])

        
     def size(self):
      #return the size if the stack
      return len(self.s)
         
     def show(self):
      #return the entire list
      return self.s
         

s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
