#implement stack using array

# Time Complexity :
# Space Complexity :
# Did this code successfully run on Leetcode :
# Any problem you faced while coding this :

class myStack:
     def __init__(self):
     
           self.a = []

         
     def isEmpty(self):

          if size() == 0:
               return True
          return False
         
     def push(self, item):
          if len(self.a) == 1000:
               print ('Stack Overflow')
          else:
               self.a.append(item)

         
     def pop(self):
          if len(self.a) ==0:
                print ('Stack Underflow')
                return

          temp = self.peek()
          self.a.pop()
          return temp      
        
     def peek(self):
          if len(self.a) ==0:
                print ('Stack Underflow')
                return

          return self.a[-1]
        
     def size(self):
         return len(self.a)
         
     def show(self):
          return self.a
         

s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
