class myStack:
    def __init__(self):
      self.items=[]

    def isEmpty(self):
        return self.items==[]
    def push(self, item):
         self.items.insert(0,item)
    def pop(self):
        return self.items.pop(0)
        
    def peek(self):
        return self.items[0]
    def size(self):
         return len(self.items)
         
    def show(self):
        print("Item inside the stack is:")
        for i in self.items:
            print(i)

    def display(abc):
        for x in abc.items:
            print(x)         

s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
