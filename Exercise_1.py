"""
// Time Complexity : for show() - O(n)
                     for all other functions - O(1)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : problem not there on Leetcode
// Any problem you faced while coding this : No

"""
class myStack:
     def __init__(self):
         self.my_stack=[] #initializing stack as a list
         
     def isEmpty(self):
         if not self.my_stack:
             return True
         return False
         
     def push(self, item):
         self.my_stack.append(item) # append item at the end of the list
         
     def pop(self):
         if self.isEmpty(): #check if my_stack is empty
             print("Stack empty")
             return None
         rem = self.my_stack.pop() # else pop the rightmost eleement in my_stack annd store in rem
         return rem
        
        
     def peek(self):
         if self.isEmpty():  #check if my_stack is empty
             print("Stack empty")
             return None
         return self.my_stack[-1] #returns the rightmost element, which would be the top of the stack
        
     def size(self):
         return(len(self.my_stack))
         
     def show(self):  #displays the my_stack list in reverse order
         display_stack = []
         
         i=len(self.my_stack)-1
         
         while i>=0:
             display_stack.append(self.my_stack[i])
             i-=1
         print(display_stack)
         

s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
