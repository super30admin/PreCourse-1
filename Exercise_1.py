"""
Time complexity O(1) and Space Complexity O(n)
"""
class myStack:
  #Please read sample.java file before starting.
  #Kindly include Time and Space complexity at top of each file

     def __init__(self):
        self.object = []
         
     def isEmpty(self):
        if self.object is []:
            return True
        else:
            return False
        
     def push(self, item):
        self.object.append(item)
         
     def pop(self):
        return self.object.pop()

     def peek(self):
        return self.object[len(self.object)-1]
        
     def size(self):
        return len(self.object)
         
     def show(self):
        return self.object
         

s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
