# Exercise_1 : Implement Stack using Array.


# // Time Complexity :
  # push :
  # pop : output
  # peek :  returns the value of the top ("front") of the collection without removing the element from the collection.
  # size
  # show
# // Space Complexity : O(n)
# // Did this code successfully run on Leetcode : No leetcode handle given
# // Any problem you faced while coding this :


# // Your code here along with comments explaining your approach
# push - check if array is full; trigger increase in length; add to the end of the array
# pop - check if empty, if not remove from the end of the array

from ctypes import pointer


class myStack:
  #Please read sample.java file before starting.
  #Kindly include Time and Space complexity at top of each file

    isEmpty = True 
    stack_array = []

    def __init__(self):
      self.stack_array = []
      self.isEmpty = True

    def isEmpty(self):
      """
      check if the stack is empty. 
      """
      return self.isEmpty

    def push(self, item):
      """
      Add an element to the top of the stack 
      """
      if len(self.stack_array)==0:
        self.isEmpty = False
      self.stack_array.append(item)

    def pop(self):
      """
      Remove the top most element of the stack and display it. 
      """
      if len(self.stack_array)==0:
        self.isEmpty = True
        print ("Nothing to pop from the stack")
        return 
      print(self.stack_array[len(self.stack_array)-1]  )
      self.stack_array.remove(self.stack_array[len(self.stack_array)-1])

    def peek(self):
      """
      print the top most value; Dont change the state of the stack
      """
      if self.isEmpty:
        print("Empty stack!")
      else : 
        print(self.stack_array[len(self.stack_array)-1])


    def size(self):
      """
      display the number of elements in the stack
      """
      print(len(self.stack_array))

    def show(self):
      """
      I am not sure what this function is supposed to achieve. Please give a description. Thanks.
      """
      pass


s = myStack()
s.push('1')
s.push('2')
print(s.pop())
# print(s.show())