class myStack:
     def __init__(self):
         self.myArray = []
     def isEmpty(self):
         return self.myArray == []
     def push(self, item):
         self.myArray.append(item)
     def pop(self):
        if (self.isEmpty()):
             return 'Stack is empty!'
        else:
             return self.myArray.pop()
     def peek(self):
        peekElementIndex = len(self.myArray) - 1
        return self.myArray[peekElementIndex]
     def size(self):
         return len(self.myArray)
     def show(self):
         return self.myArray

s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
