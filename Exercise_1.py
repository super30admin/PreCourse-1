class myStack:
  #Please read sample.java file before starting.
  #Kindly include Time and Space complexity at top of each file
     def __init__(self):
      self.stack=[]

    #Time Complexity : O(1)
    #Space Complexity : O(1) 
     def isEmpty(self):
      if self.size()<=0:
        return True
      else:
        return False

    #Time Complexity : O(1)
    #Space Complexity : O(1)  
     def push(self, item):
       self.stack.append(item)
       print("Adding the following item to stack:",item)

    #Time Complexity : O(1)
    #Space Complexity : O(1)
     def pop(self):
       if(self.isEmpty()):
         print("Stack is Empty")
       return self.stack.pop()

    #Time Complexity : O(1)
    #Space Complexity : O(1) 
     def peek(self):
       if(self.isEmpty()):
         print("Stack is Empty")
         return None
       else:
        print("Top element:",self.stack[-1])
        return self.stack[-1]
       
    #Time Complexity : O(1)
    #Space Complexity : O(1)  
     def size(self):
       return len(self.stack)

    #Time Complexity : O(1)
    #Space Complexity : O(1)   
     def show(self):
       return self.stack

s = myStack()
s.push('1')
s.push('2')
s.peek()
print("Removing Element:",s.pop())
s.peek()
print("Stack Contains:",s.show())
