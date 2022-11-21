#Time Complexity: O(1)
#Space Complexity: O(n), where n is the number of elements in the stack

class myStack:
  #Please read sample.java file before starting.
  #Kindly include Time and Space complexity at top of each file
     def __init__(self):
       self.stack = [] #Initialize an array 'stack' to store the elements of the stack
         
     def isEmpty(self):
      if(len(self.stack) == 0): #If there are no elements in the stack, length will be 0
        return True
      else:
        return False
           
     def push(self, item):
       self.stack.append(item) #Append the new element to the stack array
         
     def pop(self):
        deletedItem = self.stack.pop() #Delete the element at the last index because it is a LIFO data structure
        return deletedItem
        
     def peek(self):
       index = len(self.stack) -1 #Return the element at the last index because it is a LIFO data structure
       return self.stack[index]
        
     def size(self):
       return len(self.stack) #Return the length of the stack array
         
     #Time Complexity: O(n), because we loop through n elements in the stack in order to have them displayed    
     def show(self):
      for i in reversed(range(len(self.stack))): #Loop through the indices in decreasing order and print the elements of the stack
         print(self.stack[i])

         

s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())