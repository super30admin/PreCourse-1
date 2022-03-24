#Time Complexity : O(1)
#Space Complexity : O(1)
#Did this code successfully run on Leetcode : Yes
#Any problem you faced while coding this : No

class myStack:
    #function to create empty stack
     def __init__(self):
         self.array_stack=[]
    #checks if stack is empty or not and return true or false
     def isEmpty(self):
         return len(self.array_stack)==0  
    #inserts the elements into the stack       
     def push(self, item):
         return self.array_stack.append(item)
    #removes the last element inserted into the stack
     def pop(self):
         return self.array_stack.pop() 
    #returns the last element of the stack       
     def peek(self):
         return self.array_stack[-1]
    #returns size of the stack
     def size(self):
         return len(self.array_stack)
    #returns the stack
     def show(self):
         return self.array_stack
        
s = myStack()
print(s.isEmpty())
s.push('1')
s.push('2')
print(s.isEmpty())
print(s.show())
print(s.pop())
s.push('3')
s.push('4')
print(s.show())
print(s.peek())
print(s.size())
print(s.show())