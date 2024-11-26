# Time Complexity : 
# All the methods defined in below have time complexity O(1) except show method, show method prints the stack so it has time complexity of O(n) where n being the number of elements in the stack
# Space Complexity :
# Space complexiy for all the methods is O(1) since its constant like length, pop or peek will return just one single element. However for the show method it would be O(n) were n being the number of elements in the stack.
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : None

class myStack:
     def __init__(self):
       self.__stack = [] # here I am defining stack as a list
         
     def isEmpty(self):
       if self.__stack:
         return False
       else:
         return True
         
     def push(self, item):
       # inserting element at the top of stack meaning end of list
       self.__stack.append(item)
         
     def pop(self):
       # removing last element from the list
       # first check if list is empty
       if not self.__stack:
         # stack is empty 
         raise Exception("pop can not be done on empty stack")
       else:
         # stack is not empty
         # remove the last element from the list
         return self.__stack.pop()
        
        
     def peek(self):
       # peek will return the top value from the stack without removing it
       if not self.__stack:
         # stack is empty
         raise Exception("peek is called on empty stack")
       else:
         # stack has some values
         # get its length 
         peek_index = len(self.__stack) - 1
         return self.__stack[peek_index]
         
        
     def size(self):
       # size of stack would be length of list
       return len(self.__stack)
         
     def show(self):
       # return the stack
       return self.__stack
       
      
s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
