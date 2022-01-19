  #time complexity for each operation is O(1) so overall 
  #time complexity is O(1)
  #space complexity is O(n) where n is no. of elements

class myStack:
  #Please read sample.java file before starting.
  #Kindly include Time and Space complexity at top of each file
     def __init__(self):
       self.resultStack=[]
         
     def isEmpty(self):

       return len(self.resultStack)==0
         
     def push(self, item):
       #append element
       return self.resultStack.append(item)
         
     def pop(self):
       #check if array is empty
       if self.isEmpty():
         return None
       else:
         #remove top element
          return self.resultStack.pop(-1)
       
     def peek(self):
       #check if array is empty
       if self.isEmpty():
         return None
       else:
         #return top element from array
         return self.resultStack[-1]
        
     def size(self):
       #return lenth of array
       return len(self.resultStack)
         
     def show(self):
       #return array
       return self.resultStack
         

s = myStack()
s.push('1')
s.push('2')
s.push('3')
print(s.pop())
print(s.show())
