'''

Time Complexity : O(N)
Space Complexity : O(N)
Did this code successfully run on Leetcode : I did not find a question on leetcode, but works fine on python compiler on vs code
Any problem you faced while coding this : No, I was able to solve this, I am still not sure if my time and space complexity is correct

'''



class myStack:
  #Please read sample.java file before starting.
  #Kindly include Time and Space complexity at top of each file
     def __init__(self):
       self.stack = []
       self.top = -1
         
     def isEmpty(self):
       if self.top == -1:
          return True
       else:
          return False
         
     def push(self, item):
        self.top +=1
        self.stack.append(item)
        return self.stack

     def pop(self):
        self.top -=1
        self.stack.pop()
        return self.stack

     def peek(self):
        return self.stack(self.top)
     def size(self):
        return len(self.stack)
         
     def show(self):
        return self.stack
         
 
s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
print(s.isEmpty())
print(s.size())
