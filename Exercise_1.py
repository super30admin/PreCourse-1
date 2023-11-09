#Please read sample.java file before starting.
#Kindly include Time and Space complexity at top of each file
  # Time Complexity :
    # Everything except for show() function has O(1) time complexity and whereas show() fucntion has O(n)
  # Space Complexity :
    # O(n), where n is the number of elements in the stack.
class myStack:
# Your code here along with comments explaining your approach
     def __init__(self):
      self.stack=[]
         
     def isEmpty(self):
        if len(self.stack)<=0: 
          return True
        else: 
          return False

     def push(self, item):
        return self.stack.append(item)
         
     def pop(self):
      if len(self.stack)>0:
        return self.stack.pop()
      else:
        return None
        
     def peek(self):
        if not self.stack:
          return None
        else:
          return self.stack[-1]

     def size(self):
         return len(self.stack)

     def show(self):
         return self.stack

s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
