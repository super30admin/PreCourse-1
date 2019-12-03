class myStack:
    def __init__(self):
        self.items = []
        print("Initialized Stack")
        pass

    def isEmpty(self):
        return self.items == []
        pass

    def push(self, item):
        print("Adding",item,"to stack")
        return self.items.append(item)
        pass

    def pop(self):
        print("Popping last item")
        if not self.items:
            return None
        #a = self.items[-1]
        #del self.items[-1]
        #return a
        return self.items.pop()
        pass

    def peek(self):
        if not self.items:
            return None
        return self.items[-1]
        pass

    def size(self):
        return len(self.items)
        pass

    def show(self):
        print("printing all values")
        return self.items
        pass

s = myStack()
s.push('1')
s.push('2')
s.push('3')
print("size is ",s.size())

print(s.pop())
print(s.show())
print("size is ",s.size())

print(s.peek())
