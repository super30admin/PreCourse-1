class myStack:
  #Please read sample.java file before starting.
  #Kindly include Time and Space complexity at top of each file
     def __init__(self):
        self.stackList = []
        
     def isEmpty(self):
         
         # If length of list == 0
         if len(self.stackList) == 0:
             return True
         else:
             return False
    
     def push(self, item):
        # Append the element to the list
        self.stackList.append(item)
        return self.peek()
    
     def pop(self):
        # Remove the last element from the list
        # Slice the list
        self.stackList = self.stackList[0:len(self.stackList)-1]
        return self.peek
    
     def peek(self):
        # Return the stack
        return self.stackList
    
     def size(self):
        return len(self.stackList)
    
     def show(self):
        # Return the stack
        return self.stackList

s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())