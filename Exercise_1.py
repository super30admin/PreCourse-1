class myStack:
    #Please read sample.java file before starting.
    #Kindly include Time and Space complexity at top of each file
    def __init__(self):
        #creates a array for stack
        self.arr = []

    def isEmpty(self):
        #This function checks if the stack is empty or it has elements
        if len(self.arr) == 0:
            return True
        else:
            return False

    def push(self, item):
        #Push function adds element to the first index of the stack
        self.arr.append(item)

    def pop(self):
        #Pop function deletes the top element
        if self.isEmpty():
            return "Empty stack"
        else:
            return self.arr.pop()

    def peek(self):
        #Peek function returns the element at top of the stack
        return self.arr[0]

    def size(self):
        #Size function returns the size of the stack
        if self.isEmpty():
            return "Empty stack"
        else:
            return len(self.arr)

    def show(self):
        return self.arr


s = myStack()
s.push('1')
s.push('2')
s.push('3')
print(s.pop())
print(s.show())
