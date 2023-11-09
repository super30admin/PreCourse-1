# Time Complexity : O(1) for each of the method implemented in class "mystack"
# Space Complexity : O(1) for each of the method implemented in class "mystack"
# Did this code successfully run on Leetcode : Not sure if this is a Leetcode problem.
# Any problem you faced while coding this : Not really. Just had to check what is peek method for 
#                                           stacks on Google. 


# Your code here along with comments explaining your approach
class myStack:
  #Please read sample.java file before starting.
  #Kindly include Time and Space complexity at top of each file
     def __init__(self):
       self.myStackArray = []

     def isEmpty(self):
       return len(self.myStackArray) == 0
         
     def push(self, item):
       return self.myStackArray.append(item)

     def pop(self):
       return self.myStackArray.pop()
        
     def peek(self):
       return self.myStackArray[-1]
        
     def size(self):
       return self.myStackArray.count()
         
     def show(self):
       return self.myStackArray

s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
