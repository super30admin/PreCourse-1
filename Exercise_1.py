class myStack:
    def __init__(self):
        self.Size = int(input('Enter the Size of the stack that you wish to create:'))
        self.array = [None] * self.Size
        self.TopPointer = -1
        
    def isEmpty(self):
        if self.TopPointer == -1:
            return True
        else:
            return False
        
    def isFull(self):
        if self.TopPointer == self.Size - 1:
            return True
        else:
            return False
        
    def push(self, item):
        if self.isFull():
            print('Stack Overflow Unable to insert:',item)
            return 'Stack Overflow'
        else:
            self.TopPointer += 1
            # if self.TopPointer >= self.Size:
            #     self.TopPointer -= 1
            #     print('Stack Overflow Unable to insert:',item)
            #     return 'Stack Overflow'
            self.array[self.TopPointer] = item
    
    def pop(self):
        if self.isEmpty() == True:
            return 'stack is empty,Stack Underflow'
        else:
            temp = self.array[self.TopPointer]
            self.array[self.TopPointer] = None
            self.TopPointer -= 1
            return temp
       
    def peek(self,index):
        if index < 0 or index > self.TopPointer:
            return 'Invalid Index'
        else:
            return self.array[self.TopPointer - index]
       
    def size(self):
        return self.TopPointer
        
    def show(self):
        if self.isEmpty() == False:
            return self.array[self.TopPointer::-1]
        return 'Empty stack'
         

s = myStack()
print('is stack empty? ',s.isEmpty())
s.push('1')
s.push('2')
s.push('3')
s.push('4')
s.push('5')
print('is stack full? ',s.isFull())
s.push('6')
s.push('7')
s.push('8')
s.push('9')
s.push('10')
print('is stack full? ',s.isFull())
print(s.pop())
print(s.pop())
print(s.pop())
print('Values at index 5 ',s.peek(5))
print(s.pop())
print(s.pop())
print('is stack empty? ',s.isEmpty())
s.push('11')
s.push('12')
s.push('13')
s.push('14')
print('stack values:',s.show())
print('Values at index 8 ',s.peek(8))
s.push('15')
s.push('16')
print('stack values:',s.show())

print(s.pop())
print(s.pop())
print(s.pop())
print(s.pop())
print(s.pop())
print('Stack curent size:',s.size())
print(s.pop())
print(s.pop())
print(s.pop())
print(s.pop())
print(s.pop())
print(s.pop())
print(s.pop())
print('Values at index 700 ',s.peek(700))
print(s.pop())
print(s.pop())
print(s.pop())
print('is stack empty? ',s.isEmpty())
print('stack values:',s.show())
print('Values at index 1 ',s.peek(1))