#time complexity : O(1)
#space complexity : O(1)
#implemented stack as array by defining a fixed size of list i.e maxsize 
class myStack:
  #Please read sample.java file before starting.
  #Kindly include Time and Space complexity at top of each file
     def __init__(self):
       self.array = []
       self.maxsize = 10
       self.top = 0
         
     def isEmpty(self):
       print(len(self.array)==0)
       #if length of the array is 0 then stack is empty & return True or False accordingly
       
         
     def push(self, item):
       if self.top >= self.maxsize:
            print("STACK IS FULL!")
       self.array.append(item)
       self.top +=1
       return True
       #if top is equal or greater than defined size of array then returns stack is full else a new item is added at the end of stack
         
     def pop(self):
        if self.top <= 0:
            print("STACK IS EMPTY!")
        item = self.array.pop()
        self.top -=1
        return item
        #if top is less or equal to 0 then stack is empty else the last item in stack is deleted
        
        
     def peek(self):
        if len(self.array) == 0:
            print("Stack is empty")
        print(self.array[len(self.array)-1])
        #first if stack is empty is checked, if not empty then the last item of stack is printed
        
     def size(self):
       return self.top
         
     def show(self):
       for i in self.array:
         print(self.array[i-1])
         
s = myStack()
s.push(1)
s.push(2)
s.push(3)
s.show()
print(f"Deleted item after popping first time: {s.pop()}")
s.show()
