# Time Complexity : O(1)
# Space Complexity : O(N) : number of elements
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No


# Your code here along with comments explaining your approach
"""
1. initializing stack with list/array
2. isEmpty : checking the size of stack
3. push : appending the element at the end of stack variable
4. pop : checking whether the stack is empty before popping the element, return last element and delete the element from the list/array else return -1
5. peek : checking whether the stack is empty before returning the last element
6. size : return the length of list/array
7. show : return the reverse of list/array
"""


class myStack:
     def __init__(self):
        self.stack= []

     def isEmpty(self):
         return self.size() == 0

     def push(self, item):
         self.stack.append(item)

     def pop(self):
         if not self.isEmpty():
            popElement = self.stack[-1]
            del (self.stack[-1])
            return popElement
         else:
            return -1

     def peek(self):
        if not self.isEmpty():
            return self.stack[-1]
        else:
            return -1
        
     def size(self):
        return len(self.stack)
         
     def show(self):
        return self.stack
         

s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
