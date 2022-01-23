class myStack:
    def __init__(self) -> None:
        self.s = []
    def isEmpty(self):
        if(len(self.s)==0):# Stack is empty
            return 0
        else: #stack is not empty
            return 1
    def push(self,item): # Inserting an item in a stack
        self.s.append(item)
    def pop(self): # deleting the recently entered item.
        a= self.isEmpty()
        if a==0:
            print('The stack is already empty')
        else:
            return self.s.pop()
            
    def peek(self): #displaying the last entered element in the stack.
        print("The topmost element inside the stack is "+ self.s[-1])
    def show(self): # displayong the entire array.
        print(self.s)

# declaring the object of the given class.
s= myStack()
s.push('1')
s.push('2')
s.peek()
print('Pop:'+ s.pop())
s.show()

# As one for loop is used in 'show' function , the time complexity is O(n)
# As one list is declared, the space complexity is O(n)

#The code is working on the python terminal.

