##Exercise_1 : Implement Stack using Array.
class myStack:
    def __init__(self): 
        self.L=[]
        self.size=0

    def isEmpty(self):
        return self.size == 0

    def push(self,item):
        # tc - o(1)
        # sc - o(1)
        self.L.append(item)
        self.size=self.size+1

    def pop(self):
        # tc - o(1)
        # sc - o(1
        self.size=self.size-1
        return self.L.pop()

    def peak(self):
        # tc - o(n)
        # sc - o(1)
        return max(self.L)
    
    def size(self):
        # tc - o(1)
        # sc - o(1)
        return self.size

    def show(self):
        # tc - o(1)
        # sc - o(1)
        return self.L
s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())