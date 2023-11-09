'''
Time Complexity : 
  All operations are O(1) except show() which takes O(n), 
  where n is number of elements in stack

Space Complexity : 
  O(n), where n is number of elements in stack

Did this code successfully run on Leetcode : 
  Not on leetcode

Any problem you faced while coding this : 
  Figuring out the pop code. In python we have inbuilt pop().


#Your code here along with comments explaining your approach
  initialised the array
  Since array in python is dynamic, therefore no overflow condition check

'''

class myStack:
  #Please read sample.java file before starting.
  #Kindly include Time and Space complexity at top of each file
     def __init__(self):
          self.stack = []
         
     def isEmpty(self):
          if len(self.stack)==0:
               return True
          else:
               return False
         
     def push(self, item):
          self.stack.append(item)
         
     def pop(self):
        if len(self.stack)==0:
             print('Stack Underflow')
             return 0
        else:
             return self.stack.pop()
        
     def peek(self):
          if len(self.stack)==0:
             print('Stack Underflow')
             return 0
          else:
               return self.stack[-1]
        
     def size(self):
          return len(self.stack)
         
     def show(self):
          print('elements in stack:')
          for i in range(len(self.stack)):
               print(self.stack[i])
         

s = myStack()
s.push('1')
s.push('2')
s.push('3')
s.push('4')
print('pop element:' + s.pop())
print('peek(top element):'+ s.peek())
print('size:' + str(s.size()))
print('isEmpty:'+ str(s.isEmpty()))
s.show()