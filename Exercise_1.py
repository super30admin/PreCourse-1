#               Time        Space
# push():       O(1)        O(1)
# pop():        O(1)        O(1)
# peek():       O(1)        O(1)
# isEmpty():    O(1)        O(1)
# size():       O(1)        O(1)

class myStack:
  #Please read sample.java file before starting.
  #Kindly include Time and Space complexity at top of each file
     def __init__(self):
          self.array = []
          self.length = 0

     def isEmpty(self):
          if self.length == 0:
               return True
          return False

     def push(self, item):
          self.array.append(item)
          self.length += 1

     def pop(self):
        item = self.array.pop()
        self.length -= 1
        return item


     def peek(self):
        if self.length > 0:
          item = self.array[-1]
          return item
        return None

     def size(self):
        return self.length

     def show(self):
         return self.array


s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
