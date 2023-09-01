class stack:
    def __init__(self):
        self.s =[]

    def push(self,val):
        s=self.s
        s.append(val)

    def pop(self):
        val=self.s[-1]
        self.s=self.s[:-1]
        return val

    def peek(self):
        return self.s[-1]

s=stack()
s.push(1)
s.push(2)
print(s.pop())
print(s.peek())
