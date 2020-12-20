# Time Complexity : O(1)
# Space Complexity : O(n) where n is the size of the array
# Did this code successfully run on Leetcode : yes
# Any problem you faced while coding this : no


class myStack:
     def __init__(self):
         self.stack=[]
     def isEmpty(self):
         return self.stack.empty()# checking if the array == null
     def push(self, item):
         return self.stack.append(item)# add atthe top of the stack
     def pop(self):
        return self.stack.pop()# deleting from the top of the stack
        
     def peek(self):
        return self.stack[len(self.stack)-1]# return the value at the top of the stack
     def size(self):
        return len(self.stack)
     def show(self):
        return self.stack

s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())