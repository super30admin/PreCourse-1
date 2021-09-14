class myStack:
  #Please read sample.java file before starting.
  #Kindly include Time and Space complexity at top of each file
     def __init__(self):
        self.data=[]
    
     def isEmpty(self):
        return self.data==[]
    
     def push(self, item):
        self.data.append(item)
     
     def pop(self):
        if self.isEmpty():
            print("Stack is Empty")
            return
        return self.data.pop()
    
     def peek(self):
        if self.isEmpty():
            print("Stack is Empty")
            return
        return self.data[len(self.data)-1]
    
     def size(self):
        return len(self.data)
    
     def show(self):
        if self.isEmpty():
            return "Stack is Empty"  
        return self.data
         

s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
