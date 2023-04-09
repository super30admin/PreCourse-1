#Time Complexity:O(1)
#Space Complexity:O(1)
#Did this code successfully run on Leetcode : Question not avaliable in Leetcode
#Any problem you faced while coding this : None
class myStack:
     def __init__(self):       #Initialization of an list as Stack
         self.Stack=[]         #time---O(1) space--O(1)

     def isEmpty(self):   
         if len(self.Stack):    #time---O(1)
             return False
         return True
     
     def push(self, item):
         self.Stack.append(item) #time---O(1)    
         
     def pop(self):
        if s.isEmpty():          #time---O(1)
            return 'Stack is Empty' 
        else:
            ele=self.Stack[-1]   #time---O(1) Space--O(1)
            self.Stack=self.Stack[0:len(self.Stack)-1]
            return ele

        
     def peek(self):            #time-O(1)     
         if s.isEmpty():         
             return 'Stack is Empty'
         else:
             return self.Stack[len(self.Stack)-1]
         
        
     def size(self):            #time-O(1)
         if s.isEmpty():
             return 0
         else:
             return len(self.Stack)
         
     def show(self):            #time-O(1)
         print(self.Stack)
         

s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
