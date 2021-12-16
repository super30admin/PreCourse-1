class myStack:
  #Please read sample.java file before starting.
  #Kindly include Time and Space complexity at top of each file

    #all 7 operations/methods take O(1) time.
     def __init__(self):
       #first we create an array
       self.items = []
     def isEmpty(self):
       #to check if its empty we compare it with an empty list
       return self.items == []
         
     def push(self, item):
       #add item to the top of the stack
       self.items.append(item)
         
     def pop(self):
       #remove item from the top of the stack
        return self.items.pop()
        
     def peek(self):
       #return top most item of a stack
       return self.items[len(items) - 1]
        
     def size(self):
       #return len of array
       return len(items)
         
     def show(self):
       return self.items
         

s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
