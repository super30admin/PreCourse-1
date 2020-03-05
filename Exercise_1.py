"""
// Time Complexity : O(1) for push and pop operations
// Space Complexity : O(n) for using array
// Did this code successfully run on Leetcode : N/A
// Any problem you faced while coding this : None
// Your code here along with comments explaining your approach
Algorithm explanation
- Initialize the array for stack as empty and top variable as -1
top variable is used to keep track of latest added element in the stack
- In case of push operation, increment the top and
 just add the element to end of the list 
- In case of pop operation, we check for two cases
    - If the stack is empty - return -1
    - Else Pop the last element from the array and decrement top by 1
        - return the element
"""


class myStack:
     def __init__(self):
        self.top = -1
        self.stk = []
        
     def isEmpty(self):
        return not self.stk

        
     def push(self, item):
        self.top+=1
        self.stk.append(item)
         
     def pop(self):
        if self.stk:
            ele = self.stk.pop()
            self.top-=1
            return ele
        return -1
        
     def peek(self):
        return self.stk[-1]
        
     def size(self):
         return len(self.stk)
     def show(self):
        for i in self.stk:
            print(i,end = " ")

s = myStack()
s.push('1')
s.push('2')
s.push('3')
s.push('4')
print(s.pop())
print(s.pop())
s.push('2')
s.push('5')
print(s.show())
print(s.pop())
print(s.show())