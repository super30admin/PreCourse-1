class myStack:
     def __init__(self):
         self.list = []
     def isEmpty(self):
          return 1 if len(self.list==0) else 0
     def push(self, item):
         self.list.append(item)
     def pop(self):
          return self.list.pop()
     def peek(self):
        return self.list[-1]
     def size(self):
         return len(self.list)
     def show(self):
          return self.list
         

if __name__ == '__main__':
     s = myStack()
     s.push('1')
     s.push('2')
     print(s.pop())
     print(s.show())
