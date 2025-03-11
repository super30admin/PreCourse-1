class myStack:
  #Please read sample.java file before starting.
# Time Complexity : O(1) if we are just showing the whole list at once. O(n) if the whole list was iterated and printed.
# Space Complexity : O(n) based on the length of the list
# Did this code successfully run on Leetcode : It worked successfully on online GDB compiler
# Any problem you faced while coding this : Had to write corner cases for certain functions like show peek and pop.


# // Your code here along with comments explaining your approach

  #Kindly include Time and Space complexity at top of each file
     def __init__(self):
         self.stack=[]  #Intializing the list
     def isEmpty(self):
         return len(self.stack)==0 # return statement which checks the condition if the list is empty or not (True if empty, False if Not empty)
     
     def push(self, item):
         self.stack.append(item)  #appending the element to the list

     def pop(self):
        if self.isEmpty(): # checking if the list is empty
            return "Stack is Empty" # if it is empty return empty
        return self.stack.pop() # instead of else statement used return pop to delete the element and also show what is deleted
        
     def peek(self):
         if self.isEmpty():  # checking if the list is empty
             return "Stack is Empty"  # if it is empty return empty
         return self.stack[-1]  # returns last element added to the list
        
     def size(self):
         return len(self.stack) # returns length of list
         
     def show(self):
         if self.isEmpty(): # checking if the list is empty
             return "Stack is empty" # if it is empty return empty
         return self.stack # return the whole list
         

s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
