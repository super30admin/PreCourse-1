# Time Complexity : O(1)
# Space Complexity : O(1) - for this problem it is O(1) since we are inserting only two items and popping one item. But if the list is n numbers, then it would be O(n)
# Did this code successfully run on Leetcode : yes
# Any problem you faced while coding this : I am not confident about how to determine space complexity for a particular algo and also I am not sure if my above analysis 
# for space complexity is correct. I have implemeted the problem using arrays.
# Also I am new to python, So my main coding language would be javascript but I would like to implement the same in python as well.

class myStack:
  #Please read sample.java file before starting.
  #Kindly include Time and Space complexity at top of each file
     def __init__(self):
       self.items = []
         
     def isEmpty(self):
       return len(self.items)  == 0
         
     def push(self, item):
       self.items.append(item)
         
     def pop(self):
       if (len(self.items) == 0):
          raise Exception("Popping from an empty stack")
       return self.items.pop()
        
     def peek(self):
       if (len(self.items) == 0):
          raise Exception("Stack is empty!")
       return self.items[len[self.items] - 1]
        
     def size(self):
       return len(self.items)
         
     def show(self):
       return self.items
         

s = myStack()
s.push('1')
s.push('2')
print(s.peek())
print(s.pop())
print(s.show())
print(s.size())
print(s.peek())