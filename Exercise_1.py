# Time complexity: Push -> O(1), Pop -> O(1), Peek -> O(1), Size: -> O(1), Show -> O(n)
# Space complexity: O(n)
# Solved on Leetcode: Yes
# Challenges: No

# Use an array and add elements to the end of the array and pop from the end
# Also update the current size during push and pop operations

class myStack:
     def __init__(self):
       self.stack = []
       self.curr_size = 0
         
     def isEmpty(self):
       return not self.stack
         
     def push(self, item):
       self.stack.append(item)
       self.curr_size +=1
         
     def pop(self):
       if self.curr_size == 0:
         print("Stack overflow")
         return 0
       self.curr_size -=1
       return self.stack.pop(-1)
        
     def peek(self):
       if self.curr_size == 0:
         return 0
       return self.stack[-1]
        
     def size(self):
       return self.curr_size
         
     def show(self):
       for val in self.stack:
         print(val)
         

s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
