##Exercise_1 : Implement Stack using Array.
class myStack:
    def __init__(self):
        self.L=[]
        self.size=0

    def isEmpty(self):
        return self.L == []

    def push(self,item):
        self.L.append(item)
        self.size=self.size+1

    def pop(self):
        self.L.pop()

    def peak(self):
        return self.L[len(self.L)-1]
    
    def size(self):
        return len(self.L)

    def show(self):
        return self.L
s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
