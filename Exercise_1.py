 # Time Complexity : push O(1) pop O(1) overall O(1)
# Space Complexity :O(1)
# Did this code successfully run on Leetcode :not checked yet
# Any problem you faced while coding this :
class myStack:
     def __init__(self):
         self.item=[]# empty item list

     def isEmpty(self):
         if len(self.item)==0:# checking if item has element or not
             return True
         else:
            return False

     def push(self, item):
         self.item.append(item)# appending element into list

     def pop(self):
         if not self.isEmpty():
             return self.item.pop()

     def peek(self):
          if not self.isEmpty():
              return self.item[-1] #returning last element as it is the top element in the stack

     def size(self):
         return self.len(item)

     def show(self):
         return self.item


s = myStack()
print(s.isEmpty())
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
