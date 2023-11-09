# Time Complexity : O(1) for operations isEmpty, push, pop, peek and size.
                  # O(n) for the show operation as it needs to traverse the whole stack
# Space Complexity: O(n) to intialize and store the elements in a stack
# Did this code successfully run on Leetcode : Not Available on leetcode
# Any problem you faced while coding this : A little trouble using the self object and OOPS concepts in python

from inspect import stack

class myStack:
    # Initialize a list stack
     def __init__(self):
      self.stack = list()

    # To check if the stack is empty
    # calculating the length of stack and equating it with 0
    # if len == 0 then True will be returned meaning the stack is empty
    # otherwise False, indicating a non-empty stack
     def isEmpty(self):
      return (len(self.stack) == 0)

    # adding the item to the last index of a list
    # visualizing as a 90deg left-rotated list
    # So the last element stays on top
     def push(self, item):
      self.stack.append(item)
      return

    # The last or top element is taken out if the stack is non-empty
    # else we just print an error message on the console and return
     def pop(self):
      if(len(self.stack) == 0):
        print('Empty Stack')
        return
      return self.stack.pop()
    # The last or top element is returned if the stack is non-empty
    # else we just print an error message on the console and return
     def peek(self):
      if(len(self.stack) == 0):
        print('Empty Stack')
        return
      return (self.stack[-1])

    # return the size by calculating the size of stack using the len function
     def size(self):
      return len(self.stack)

    # iteratively print all the elements in the stack
     def show(self):
      for element in self.stack:
        print(element,end="->")


s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())