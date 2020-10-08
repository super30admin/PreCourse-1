# Time Complexity : O(n)
# Space Complexity : O(n)
# Any problem you faced while coding this : No
class myStack:

     #Intialized the array as elements need to be added to it later
     def __init__(self):
          self.stackArray = []

     #To check if the stack is empty, checking the size is more than zero
     def isEmpty(self):
          stackSize = self.size()
          if (stackSize>0):
               return True
          else:
               return False

     # To append the element to the stack, I used the append function to insert the element at end of array which means on top of previous element
     def push(self, item):
          if item is not None:
               self.stackArray.append(item)
          else:
               print("The element cannot be None! Please enter a valid element")
          
     # For implementing the pop operation, I remove tthe last element in a non-empty array and reeturn it back to user
     def pop(self):
          if self.isEmpty()==True:
               elem = self.stackArray.pop()
               return elem
          else:
               print("Empty Stack! Cannot pop element from an empty stack.")

     # To peek into a non-empty stack, I return the topmost element in the stack which is last eelement of the array
     def peek(self):
          if not self.isEmpty():
               peekElem  = self.stackArray[-1]
               return peekElem
          else:
               print("Stack is empty hence cannot peek!")

     #To determine the size of array, length of array is checked
     def size(self):
          return len(self.stackArray)

     # To show the stack, the stack array is returned and printed
     def show(self):
          return self.stackArray


s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
