class myStack:
    def __init__(self, top = -1):
        self.data = []
        self.top = top

    def isempty(self):
        if len(self.data) == 0:

            return 0

    def push(self, e):
        if self.top < 4:
            self.data.append(e)
            self.top +=1
            print('Push operation Successful')
            return
        else:
            print('Stack Overflow')
            return

    def pop(self):
        if self.isempty() == 0:
            return print("Stack Underflow")
        else:
            pop = self.data.pop()
            self.top -=1
            print('Pop Operation Successful')
        return pop


    def peek(self):
        if self.isempty() ==0:
            return print("Stack is Empty")
        else:
            return self.data[-1]

    def size(self):
         return len(self.data)

    def show(self):
         return self.data
         

s = myStack()
s.push('1')
s.push('2')
s.push('3')
s.push('4')
s.push('5')
s.push('6')
s.push('7')
print(s.pop())
print(s.pop())
print(s.pop())
print(s.pop())
print(s.pop())
print(s.pop())
print(s.pop())
print(s.pop())

print(s.show())
