# Time Complexity : O(1) for push, pop, peek
# Space Complexity : The space complexity for the methods is O(1), 
    # but the space complexity for the entire stack is O(n), where n is the number of items in the stack
# Did this code successfully run on Leetcode : N/A
# Any problem you faced while coding this : No problem faced
# Your code here along with comments explaining your approach - 
  # Keeping data_arr array to store the items in the array and counter to keep track of
  # number of elements in the array instead of calling len(array) as this operation will be
  # O(n)


class myStack:
  #Please read sample.java file before starting.
  #Kindly include Time and Space complexity at top of each file
     def __init__(self):
          self.data_arr = []
          self.counter = 0
         
     def isEmpty(self):
          if self.counter == 0:
               return True
          return False
         
     def push(self, item):
          self.data_arr.append(item)
          self.counter+=1
         
     def pop(self):
          self.counter-=1
          return self.data_arr.pop()

        
     def peek(self):
          return self.data_arr[-1]
        
     def size(self):
          return self.counter
         
     def show(self):
          return self.data_arr
         
s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
