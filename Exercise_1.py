'''
Implement Stack using Array.
'''

# Time Complexity : O(1) for push and pop operations, O(n) for show operation, O(1) for isEmpty, peek, and size operations
# Space Complexity : O(n) where n is the number of elements in the stack 
# Did this code successfully run on Leetcode : NA
# Any problem you faced while coding this : Yes, in the pop and peek methods, I had to handle the case when the stack is empty to avoid errors.

class myStack: # humne class banaai hai jo stack ko implement karegi using array (We have created a class that will implement the stack using an array)
  #Please read sample.java file before starting.
  #Kindly include Time and Space complexity at top of each file
    def __init__(self): # humne constructor banaya hai jo stack ko initialize karega (We have created a constructor that will initialize the stack)
          self.stack = [] # yeh stack ko ek khali list se initialize karega (This will initialize the stack with an empty list)
        
    def isEmpty(self): # yeh method check karega ki stack khali hai ya nahi (This method will check if the stack is empty or not)
          return len(self.stack) == 0 # agar stack ki length 0 hai to khali hai and ye boolean value True return karega (If the length of the stack is 0, it is empty and will return a boolean value True)
        
    def push(self, item): # yeh method stack mein item ko push karega (This method will push an item onto the stack)
          self.stack.append(item) # yeh item ko stack ke end mein add karega by using append method of list (This will add the item to the end of the stack using the append method of the list)
        
    def pop(self): # yeh method stack se item ko pop karega (This method will pop an item from the stack)
          if self.isEmpty(): # yeh isEmpty method ko call karega to check if stack khali hai ya nahi (This will call the isEmpty method to check if the stack is empty or not)
              print("Stack is empty or underflow") # agar stack khali hai to error message print karega (If the stack is empty, it will print an error message)
              return None # aur None return karega (and will return None)
          return self.stack.pop() # agar stack khali nahi hai to last item ko pop karega and return karega (If the stack is not empty, it will pop the last item and return it)
        
    def peek(self): # yeh method stack ke top item ko return karega bina usse pop kiye (This method will return the top item of the stack without popping it)
          if self.isEmpty(): # yeh isEmpty method ko call karega to check if stack khali hai ya nahi (This will call the isEmpty method to check if the stack is empty or not)
              print("Stack is empty or underflow") # agar stack khali hai to error message print karega (If the stack is empty, it will print an error message)
              return None # aur None return karega (and will return None)
          return self.stack[-1] # agar stack khali nahi hai to stack ke last item ko return karega (If the stack is not empty, it will return the last item of the stack)
    
    def size(self): # yeh method stack ki size return karega (This method will return the size of the stack)
          return len(self.stack) # yahaan hum list ke length method ka use kar rahe hain to get the size of the stack (Here we are using the length method of the list to get the size of the stack)
        
    def show(self): # yeh method stack ke elements ko display karega (This method will display the elements of the stack)
          return self.stack[::-1]  # yahaan hum list ke slicing ka use kar rahe hain to reverse the stack and display it (Here we are using the slicing of the list to reverse the stack and display it)

s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
