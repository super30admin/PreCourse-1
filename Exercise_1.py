# Time Complexity : O(1)
# Space Complexity : O(n) #size of stack
# I ran this code on my PC, it successfully gave the desired output
# I didn't know how to calculate the space complexity for a particular chunk of code, so I had to google it.

class myStack:
  #Please read sample.java file before starting.
  #Kindly include Time and Space complexity at top of each file
   def __init__(self):
         self.arr = [] #Initializing an empty list

   def isEmpty(self):
      if len(self.arr) == 0: #checking with the "len" function to check whether the list is empty or not
         print("Stack is empty")
      else:
         print("Stack has some elements in it")
         
   def push(self, item):
       if self.arr.append(item): #appending the item on top of stack
           print(item , " was added to the stack")

         
   def pop(self):
        tempData = self.arr.pop() #removing the last added data from the stack
        print(tempData , " Was popped from the stack")

   def peek(self):
       if len(self.arr)!= 0:
           print(self.arr[len(self.arr)-1] , " is at top of the stack")
       elif len(self.arr) == 0:
           print("Satck is empty")

        
   def size(self):
       print("The current size of stack is " , len(self.arr))

         
   def show(self):
       print("The current stack is as follows : \n" , self.arr)

         

s = myStack()
s.push('1')
s.push('2')
s.push("3")
s.peek()
print(s.pop())
print(s.show())
