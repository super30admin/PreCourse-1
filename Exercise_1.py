#Exercise 1 : Implement a stack using Array

#Time Complexity : O(1)
#According to my understanding, this is so because any operation on the stack(pop, push etc) is a constant time operation, 
#as it is independent of how many elements are present in the array stack implementation.

#Space Complexity : O(N)
#The space complexity is O(N) as the maximum space taken up is the length of the array N, which is the number of characters present in the array.

class myStack:
    def __init__(self):
      self.items = []
         
    def isEmpty(self):
      return self.items == []
         
    def push(self, item):
      self.items.insert(0, item)
         
    def pop(self):
      return self.items.pop(0)
        
    def peek(self):
      return self.items[0]
        
    def size(self):
      return len(self.items)
         
    def show(self):
      return self.items

s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
