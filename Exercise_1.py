# Time complexity: O(1) Since every operation deals with changing the index or changing value at the last location
# Space Complexity: O(n) where n is the maximum number of elements that can be stored in the stack

class myStack:
  #Please read sample.java file before starting.
  #Kindly include Time and Space complexity at top of each file
     def __init__(self):
          # Initialize an array of size 10 to store elements
          # The index variable points to the last element in the stack
          self.arr = [0]*10
          self.index = -1
         
     def isEmpty(self):
          if self.index < 0:
               return True
          return False
         
     def push(self, item):
          # Change value of the last index in array and update the index variable
          if self.index+1 < len(self.arr):
            self.arr[self.index + 1] = item
            self.index += 1
          else:
               print('Maximum size of stack reached')
         
     def pop(self):
          # This operation should remove the most recently added element from the list.
          # This can be done by just decrementing the index
          if self.index == 0:
               print('Empty Stack. Cannot pop elements')
               return
          self.index -= 1
          return self.arr[self.index + 1]
        
        
     def peek(self):
          # Take a look at the most recently added eleemnt to the stack
          return self.arr[self.index]
        
     def size(self):
          print(f'Size: {self.index + 1}')
          return self.index + 1
         
     def show(self):
          # Printing all elements in the stack
          return self.arr[:self.index + 1]
         

s = myStack()
print(s.isEmpty())
s.push('1')
s.push('2')
print(s.isEmpty())
print(s.size())
print(s.peek())
print(s.pop())
print(s.show())
