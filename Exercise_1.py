class myStack:
  #Please read sample.java file before starting.
  #Kindly include Time and Space complexity at top of each file
     def __init__(self):
        self.items = []
         
     def isEmpty(self):
        return len(self.items) == 0
         
     def push(self, item):
        self.items.append(item)
         
     def pop(self):
        if not self.isEmpty():
           return self.items.pop()

        else:
           raise IndexError("remove from empty stack")
        
        
     def peek(self):
        if not self.isEmpty():
           return self.items[-1]
        else:
           raise IndexError("peek from empty stack")
        
     def size(self):
        return len(self.items)
         
     def show(self):
        if not self.isEmpty():
           print("All the elements present in the stack:")
           for item in reversed(self.items):
              print(item)
        else:
           print("Stack is empty")
         

s = myStack()
s.push('1')                                            # push() will simply put the elements in the stack in LIFO
s.push('2')
s.push('3')
s.push('4')

print(s.pop())                                         # pop() will remove the last element from the stack i.e.4
print(s.peek())                                        # peek() will display the last element without removing it
print(s.show())                                        # show() will display the final stacked elements, after any operations done already
print("Is the stack empty?", s.isEmpty())              # isEmpty() will check the stack if it is empty or not, incase it is empty it will raise a exception
print(s.size())                                        # size() will display the total elements' count
