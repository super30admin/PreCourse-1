class myStack:
# Time Complexity :
  # isEmpty operation: O(n) [We traverse the array to find the length,
  #                          If we keep a counter then it will be O(1)]
  # push operation: O(1)
  # pop operation: O(1)
  # peek operation: O(1)
  # size operation: O(n)
  # show operation: O(1)

# Space Complexity :
# Did this code successfully run on Leetcode :
# -> No
# Any problem you faced while coding this :
# -> Was unable to determing the Time and Space complexity correctly


     def __init__(self):
       self.stack = []

     def isEmpty(self):
       if len(self.stack) == 0:
         return True
       else:
         return False

     def push(self, item):
       self.stack.append(item)

     # Pop the last added element
     def pop(self):
       self.stack.pop()

     def peek(self):
       return self.stack[-1]

     def size(self):
       return len(self.stack)

     def show(self):
       return self.stack


s = myStack()
s.push('1')
s.push('2')
print(s.show())
print(s.pop())
print(s.show())
