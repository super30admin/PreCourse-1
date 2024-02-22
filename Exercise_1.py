# Time Complexity : O(1)
# Space Complexity : O(n) 
# Did this code successfully run on Leetcode :
# Any problem you faced while coding this : No

#Your code here along with comments explaining your approach

class myStack:
  #Please read sample.java file before starting.
  #Kindly include Time and Space complexity at top of each file
    # Here I have initialized the stack using list datastructure in python
     def __init__(self):
         self.stack_list = []

    # This function checks if the stack is empty or not and returns True or False
     def isEmpty(self):
        if len(self.stack_list) == 0:
            return True
        else:
            return False
    # This function pushes an item to the stack
     def push(self, item):
         self.stack_list.append(item)

    #This function removes the last item pushed in stack.
    #It also checks whether the stack is empty or not
     def pop(self):
         if len(self.stack_list) == 0:
            return None
         return self.stack_list.pop()

    #This function checks if the stack is empty or not and then returns the topmost element
     def peek(self):
        if len(self.stack_list) == 0:
            return None
        return self.stack_list[-1]

    #This function returns the length of the stack
     def size(self):
         return len(self.stack_list)

    #This function returns the stack
     def show(self):
         return self.stack_list

s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())

