class myStack:
  #Please read sample.java file before starting.
  #Kindly include Time and Space complexity at top of each file
     def __init__(self):
       self.stack=[]
         
     def isEmpty(self):
       self.stack==[]
         
     def push(self, item):
        self.stack.append(item)
        print("Element pushed ", item)
        print(self.stack)
        
        
     def pop(self):
        if(not self.isEmpty()):
            lastElement=self.stack[-1]
            del(self.stack[-1])
            print("Popped Element is ", lastElement)
            print(self.stack)
        else:
            return("stack is empty")

        
     def peek(self):
        if(not self.isEmpty()):
            first=self.stack[-1]
            print("Peeked Element is ",first)
            print(self.stack)
        else:
            print("Stack is Empty")
        
     def size(self):
        size=len(self.stack)
        print("Size of stack is ", size)
         
     def show(self):
       print("Displaying Stack Elements ",self.stack)
         

s = myStack()
s.push('1')
s.push('2')
s.push('3')
s.push('4')
s.size()
s.pop()
s.pop()
s.size()
s.peek()
s.show()
