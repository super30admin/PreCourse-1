class stackarray:
    
    def __init__(self):
        self.items = []
        
    def isEmpty(self):
        return self.items==[]

    def push(self,item):
        self.items.append(item)

    def pop(self):
        return self.items.pop()

    def peek(self):
        return self.items[len(self.items)-1]

    def size(self):
        return len(self.items)

    def show(self):
        return self.items

s=stackarray()
s.push('1')
s.push('2')
s.push('3')
s.push('4')
print("POP")
print(s.pop())
print("STACK")
print(s.show())
