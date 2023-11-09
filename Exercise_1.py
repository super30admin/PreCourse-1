 
class myStack:
     def __init__(self):
         self.stack =[]
     def isEmpty(self):  

         #time complexity: O(n) 
         #space complexity: O(1) - Space Complexity of isEmpty Operation is O(1) as it only checks the length of stack and no additional space is required.

         return len(self.stack) == 0
         
     def push(self, item): 
         
         #Best Case time complexity: O(1)
         #Worst Case time complexity: O(n) - Worst Case Scenario would be O(n) in case of a array implementation of stack where the array is completely filled, then the array size needs to be changed and all the elements must be copied from one array to another , this would result in time being O(n).
         #space complexity: O(1)  

         self.stack.append(item)
         
         
     def pop(self):  
        
         #Best case time complexity:  O(1) - Deletion operation deletes only one element at a time
         #Worst case time complexity: O(1)
         #space complexity: O(1) - Space Complexity of Pop Operation is O(1) as no additional space is required for it.

         if(not self.isEmpty()):
            self.stack.pop() 
         
        
     def peek(self):  
         
         #time complexity: O(1) - Worst and Best Time Complexities of Peek operation are O(1), as peeking only returns the top of the stack.
         #space complexity: O(1) - Space Complexity of Peek Operation is O(1) as no additional space is required for it. 

         if self.isEmpty():
            return None     # return none if the stack is empty
         return self.stack[-1] # if the stack is not empty, return the last element
        
     def size(self): 
         
         #In python, whenever anything is pushed or popped into the container, the variable holding the size of the container increases or decreases depending upon the action; and when len() is called on that container, it internally calls __len__() and that returns that variable( the one holding the size of the container). That’s why len() is O(1)
         #time complexity: O(1)
         #space complexity: O(1) 

         return len(self.stack)
         
     def show(self):  

         #time complexity: O(1)
         #space complexity: O(n) , to show n elements, the time complexity will be O(n)

         return self.stack
         

s = myStack()
s.push("1")
print(s.show())
s.push("2")
print(s.show())
print(s.pop())
print(s.size())
print(s.show())
s.push("3")
print(s.size())
print(s.show())
print(s.peek())



