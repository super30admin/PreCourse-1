class myStack:
     def __init__(self):
         self.array = []
         
     def isEmpty(self):
         if len(self.array) == 0:
             return True
         else:
             return False
         
     def push(self, item):
         """

         :param item:
         :return: None
         """
         self.array.append(item)

     def pop(self):
         """
         The top most element is removed and returned.
         If the stack is empty, will raise IndexError
         :return: element
         """
         if self.isEmpty():
             raise IndexError
         element = self.peek()
         self.array = self.array[:self.size()-1]
         return element

     def peek(self):
         """
         peek is used to retrieve or fetch the first element of the Stack or the element present at the top of the Stack.

         :return: NULL if stack is empty, else the top element of stack.
         """
         if self.isEmpty():
             return None
         else:
             return self.array[-1]
        
     def size(self):
         return len(self.array)
         
     def show(self):
         return self.array

s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
