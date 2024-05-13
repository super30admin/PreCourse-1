'''
Time and space complexity:
initialization: Time -> O(1); Space -> O(1)
isEmpty(): Time -> O(1); Space -> O(1)
push(): Time -> O(1); Space -> O(1)
pop(): Time -> O(1); Space -> O(1)
peek(): Time -> O(1); Space -> O(1)
size(): Time -> O(1); Space -> O(1)
show()): Time -> O(1); Space -> O(1)
'''

class myStack:
  #Please read sample.java file before starting.
  #Kindly include Time and Space complexity at top of each file
    def __init__(self):
      self.__stackArray = []
        
    def isEmpty(self):
      return self.size() == 0
        
    def push(self, item):
      self.__stackArray.append(item)
        
    def pop(self):
      return self.__stackArray.pop()
      
    def peek(self):
      return self.__stackArray[-1]
      
    def size(self):
      return len(self.__stackArray)
        
    def show(self):
      return self.__stackArray
         

s = myStack()
s.push('a')
s.push('b')
print(s.show())
print(s.size())
print(s.peek())
print(s.size())
print(s.pop())
print(s.size())
print(s.show())
