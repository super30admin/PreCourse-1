class myStack:
   
    #Intializing each object of the class with a stack
    def __init__(self):
        self.stack = []
        
    # Checking the length of the stack to see it it's empty or not   
    def isEmpty(self):
        if(len(self.stack))==0:
            return True
        else:
            return False
    #Appending an element into the stack    
    def push(self, item):
        self.stack.append(item)
        
    #Removing the top element in the Stack, before that checking if the stack is empty or not     
    def pop(self):
        if(len(self.stack)==0):
            print ("Stack is already Empty")
        else:
            topElement = self.stack[-1]
            self.stack.remove(topElement)
    
    #Printing the top element in the stack if the stack is not empty     
    def peek(self):
        if(len(self.stack)==0):
            print("Stack is empty, no elements to show")
        else:
            topElement = self.stack[-1]
            return topElement
    # Returning the length of the stack    
    def size(self):
        return len(self.stack)
    
    # Returning the current stack elements
    def show(self):
        return self.stack
         
s = myStack()
s.push('1')
s.push('2')
print(s.peek())
print(s.show())   
