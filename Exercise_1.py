#Time Complexity : O(1) for all operations
#Space Complexity : O(n)


class myStack:
  #Please read sample.java file before starting.
  #Kindly include Time and Space complexity at top of each file
     def __init__(self):
         #create an empty stack
         self.st = []
         
     def isEmpty(self):
         if self.st == []:
             return True
         else:
             return False
         
     def push(self, item):
         #add item to end of list
         self.st.append(item)
         
     def pop(self):
         #if not empty remove last item and return it
        if self.st != []:
            pop_element = self.st[-1]
            del self.st[-1]
            return pop_element
        
     def peek(self):
         #return last item
         if self.st != []:
             return self.st[-1]
        
     def size(self):
         #return size of list
         return len(self.st)
         
     def show(self):
         #return the created stack
         return self.st

s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
