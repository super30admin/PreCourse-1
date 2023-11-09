"""
Exercise_1 : Implement Stack using Array.

Time Complexity : O(1)
Space Complexity : O(N)

As Stack is a LIFO order operation.
Here array is used as a data structure to replicate the functionality of Stack

push(), pop(), isEmpty() and peek() all take O(1) time as we do not run any loop in any of these operations     


@name: rahul
"""

class myStack:
  #Please read sample.java file before starting.
  #Kindly include Time and Space complexity at top of each file
  
  #Function to initialize Stack as Array and the index(top) to -1
    def __init__(self):
        self.stack=[]
        self.top=-1
     
        
  #Function to cehck if the Stack is empty by calling the Fn size which checks the lenth of the array
    def isEmpty(self):
        
        if(self.size()):
            return False
            
        return True
   
    #Function to add item to the Stack and the top index is incremented to point to New item      
    def push(self, item):
        self.top +=1
        self.stack.append(item)
    
    #Function to remove item to the Stack and the top index is decremented to point to previous item           
    def pop(self):
        
        if (self.isEmpty()):
            print("Stack is Empty")
        else:
            self.top -=1
            self.stack.pop()
           
    #Function to get the top most item by using the top index           
    def peek(self):
        
        return self.stack[self.top]
       
    def size(self):
        
        return len(self.stack)
     
    #Function to iterate the items
    def show(self):
        for i in range (self.top,-1,-1):
            if i == self.top:
                print(self.stack[i]," <---TOP")
            else:
                print(self.stack[i])
            
         
        

s = myStack()
s.push('1')
s.push('2')
s.push('4')
print(s.peek())
print(s.size())
print(s.isEmpty())
print(s.pop())
print(s.show())