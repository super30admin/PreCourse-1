class myStack:
  #Please read sample.java file before starting.
  #Kindly include Time and Space complexity at top of each file
  #Time Complexity:
  #push(),pop(),peek() - O(1)
  #isEmpty(),size(),show() - O(1) to O(n)
  #Space Complexity: O(n)
     def __init__(self):
        self.bucket=[] # creates empty list to hold stack items.
     def isEmpty(self):
         return len(self.bucket)==0 # checks if the stack is empty.
     def push(self, item):
         self.bucket.append(item) # adds an item at the top of the stack.
     def pop(self): # method to remove the top item from stack 
        if self.isEmpty(): #checks if the stack is empty.
            print("empty stack!Nothing to remove")
            return None
        return self.bucket.pop() #if not empty removes and returns last item.
     def peek(self): #shows the top item 
        if self.isEmpty():
            print("Empty Stack!Nothing to top.")
            return None
        return self.bucket[-1] #accesses the top item
     
     def size(self): #gives the number of items in the stack.
         return len(self.bucket)
     def show(self): #shows the complete stack.
         if self.isEmpty():
             return "Empty Stack."
         return f"Current Stack:{self.bucket}" #shows all items in the list.
         

s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
