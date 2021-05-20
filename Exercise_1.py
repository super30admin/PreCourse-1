class myStack:
     def __init__(self):
         self.arr = []
     def isEmpty(self):
         return len(self.arr) == 0
     def push(self, item):
         self.arr.append(item)
     def pop(self):
        last_el = self.arr[-1]
        self.arr.pop()
        return last_el
     def peek(self):
        return self.arr[0]
     def size(self):
         return len(self.arr)
     def show(self):
         return self.arr

s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
