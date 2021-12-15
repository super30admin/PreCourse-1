#Time Complexity is O(1) (Constant Time)
#Space Complexity is O(1) (Constant Time)
class myStack:
  
  #Please read sample.java file before starting.
  #Kindly include Time and Space complexity at top of each file
     def __init__(self):
       self.init_max=1000
       self.data = [0]*self.init_max
       self.top=-1
    
     #Time Complexity Of this function is O(1) (Constant Time)
     #Space Complexity Of this function is O(1) (Constant Time)
     def isEmpty(self):
       if self.top<0:
         return True
       else:
          return False

     #Time Complexity Of this function is O(1) (Constant Time)
     #Space Complexity Of this function is O(1) (Constant Time)
     def push(self, item):
       if self.top >= self.init_max:
          print("Stack Is Full!!!")
          return
       else:
         self.top=self.top+1
         self.data[self.top] = item
         print("Item "+ item +" is pushed into Stack")

     #Time Complexity Of this function is O(1) (Constant Time)
     #Space Complexity Of this function is O(1) (Constant Time)            
     def pop(self):
       if self.isEmpty():
          print("Stack Is Empty!!!")
          return
       else:
         item =self.data[self.top]
         self.top=self.top-1
         print("Item "+ str(item) +" is poped out from Stack")
         return item
       
     #Time Complexity Of this function is O(1) (Constant Time)
     #Space Complexity Of this function is O(1) (Constant Time)   
     def peek(self):
       if self.top<0:
         print("Stack is empty")
       else:
        return self.data[self.top]

     #Time Complexity Of this function is O(1) (Constant Time)
     #Space Complexity Of this function is O(1) (Constant Time)   
     def size(self):
       return len(self.data)
         
     def show(self):
       for x in range(0,self.top+1):
         print(str(self.data[x])+" ")
       return "\n"
         

s = myStack()
s.push('1')
s.push('3')
s.push('2')
s.push('3')
s.push('5')
print(s.pop())
print(s.pop())
print(s.show())
