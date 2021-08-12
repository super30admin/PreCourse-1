"""
Using LIFO for stack implementation in list
"""
class myStack:

     def __init__(self):
          """
          Initialize the itemlist as a list
          """
          self.itemlist=[]

     def isEmpty(self):
          """
          We check if the list stack is empty or not
          """
          if self.itemlist==[]:
               return "Stack is empty"
          else:
               return "Stack is not empty"

     def push(self, item):
          """
          Pushing the item into the stack like appending in an array at the back
          """
          self.itemlist.append(item)

     def pop(self):
          """Popping the last element inserted from the stack"""
          self.itemlist.pop()

     def peek(self):
          """Checking the last element inserted in the stack"""
          if self.itemlist:
               return self.itemlist[-1]
          else:
               return None                        
        
     def size(self):
          """
          Checking the size of the stack
          """
          if self.itemlist:
               return len(self.itemlist)
          else:
               return None
         
     def show(self):
          """
          The show function to print the stack
          """
          return self.itemlist


s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
