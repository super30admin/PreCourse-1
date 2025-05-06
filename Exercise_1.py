# Time and Space complexity at top of each file - Assuming this is overall TC and SC

# Time Complexity - O(1) for every operation ; show() and size() takes O(n) 
# Space Complexity - O(n) - n is the maximum size

class myStack:
  #Please read sample.java file before starting.
  #Kindly include Time and Space complexity at top of each file

     def __init__(self):
          self.stack = [] #Initialize stack array
          self.maximum_size = 100 #Maximum size mentioned in .java file is 100. Used to check overflow condition
                                  
     def isEmpty(self):
          if not self.stack:
               return True # Check if stack is empty and return True
          return False # Else False
         
     def push(self, item):
          if len(self.stack) > self.maximum_size: # Checking overflow before pushing
               print("Stack Overflow")
          self.stack.append(item) # Push item to stack
          return True
         
     def pop(self):
          if not self.stack:
            print("Stack Underflow") # Checking underflow before popping
            return 0
          return self.stack.pop() # Pop and return the popped elemnent
            
     def peek(self):
          if not self.stack:
               return -1
          return self.stack[-1]  # Return the top element without popping
        
     def size(self):
          return len(self.stack) # Find size of stack
                   
     def show(self):
          if not self.stack:
               print("No Stack")
          for i in range(len(self.stack) - 1, -1,  -1): # Printing elements from top to bottom
               print(self.stack[i])
          
if __name__== "__main__" :    

  s = myStack()                     # Initialize instance of Stack class
  print(s.isEmpty())                # True
  s.push('1')                       #[Push 1]
  s.push('2')                       #[Push 2]
  print("Popped Element",s.pop())  # "Popped Element : 2"
  s.show()                          # 1
  print(s.isEmpty())                # False
  print(s.peek())                   # 1
  print(s.size())                   # 1

