#space = O(n)
class myStack:
  #Please read sample.java file before starting.
  #Kindly include Time and Space complexity at top of each file
     def __init__(self):
        self.arr=[]
         
     def isEmpty(self):
        # time = O(1)
        return self.arr==[]

     def push(self, item):
        # time = O(1)
        self.arr.append(item)
         
     def pop(self):
        # time = O(1)
        if (not self.isEmpty()):
           last = self.arr.pop()
           return last
        else:
           return("Stack is empty")


        
     def peek(self):
        # time = O(1)
        if (not self.isEmpty()):
           return self.arr[0]
        else:
           return ("Stack is empty")
        
     def size(self):
        # time = O(1)
        return len(self.arr)
         
     def show(self):
        # time = O(n)
        print(self.arr)
         

s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
