class myStack:
  #Please read sample.java file before starting.
  #Kindly include Time and Space complexity at top of each file

  #Time and Space Complexity
  # Overall Space Complexity = O(N) where N is the MAX_SIZE of 1000
  # __init__ function has the time and space complexity of O(N)
  # isEmpty function has the time and space complexity of O(1)
  # push function has the time and space complexity of O(1)
  # pop function has the time and space complexity of O(1)
  # peek function has the time and space complexity of O(1)
  # size function has the time and space complexity of O(1)
  # show function has the time and space complexity of O(M) where M dentoes the number of elements in the stack


     def __init__(self):
          self.MAX_SIZE=1000
          self.array=[None]*self.MAX_SIZE
          self.top=-1
         
     def isEmpty(self):
          if self.top==-1:
               return True
          return False
         
     def push(self, item):
          if self.top<self.MAX_SIZE-1:
            self.top+=1
            self.array[self.top]=item
          else:
            print("Stack Overflow")
            return False
         
     def pop(self):
          if self.top>-1:
            value=self.array[self.top]
            self.top-=1
            return value
          else:
            print("Stack Underflow")
            return False
            
     def peek(self):
         if self.top==-1:
             return False
         else:
             return self.array[self.top]
        
     def size(self):
         return self.top+1
         
     def show(self):
         return self.array[0: self.top+1][::-1]  
     

s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
