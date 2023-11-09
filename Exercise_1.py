"""
Using LIFO for stack implementation in list
Time Complexity- Initializing O(1)
isempty- O(1)
pushing- O(n)
Popping- O(1)
Time complexity of len- O(1)
Time Complexity of show- O(n)
Space Complexity-
Initializing O(1)
isempty- O(1)
pushing - O(n) since the size should grow linearly with the number of elements we add
Popping- O(1)
Space complexity of size- O(1)
Space Complexity of show/print should be- O(1) since array is already defined we are just printing it
Explanation-
For initialzation we will declare an empty array, and for checking if the array is empty or not
we will just check if the array has any element or not, for pushing we will use append object of list, 
for popping we will just use pop object of the list class already defined in the  class, for peeking we will
retrieve the last element of the array, for checking the size we will return the length of the list; for showing
we will print all the elements of the array

"""
class myStack:

     def __init__(self):
          """
          Initialize the itemlist as a list
          """
          self.itemlist=[]

     def isEmpty(self):
          """
          We check if the list stack is empty or not
          """
          if self.itemlist==[]:
               return "Stack is empty"
          else:
               return "Stack is not empty"

     def push(self, item):
          """
          Pushing the item into the stack like appending in an array at the back
          """
          self.itemlist.append(item)

     def pop(self):
          """Popping the last element inserted from the stack"""
          self.itemlist.pop()

     def peek(self):
          """Checking the last element inserted in the stack"""
          if self.itemlist:
               return self.itemlist[-1]
          else:
               return None                        
        
     def size(self):
          """
          Checking the size of the stack
          """
          if self.itemlist:
               return len(self.itemlist)
          else:
               return None
         
     def show(self):
          """
          The show function to print the stack
          """
          return self.itemlist


s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
