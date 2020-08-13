class myStack:
     def __init__(self):
         self.arr = []
         self.length = 0

     def isEmpty(self):
         return None

     def push(self, item):
         self.arr.append(item)
         self.length += 1

     def pop(self):
        popped_item = self.arr[self.length-1]
        del self.arr[self.length-1]
        self.length -= 1
        return popped_item

     def peek(self):
       return self.arr[self.length-1]
        
     def size(self):
       return self.length-1

     def show(self):
       return self.arr
         

s = myStack()
s.push('1')
s.push('2')
s.push('3)
print(s.pop())
print(s.show())
