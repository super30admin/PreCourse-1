#
### Time complexity: O(1)
### Space complexity: O(n)
# 
class myStack:
    def __init__(self):
        ### define stack size, initialize data list and intialize top pointer with -1
        self.__size = 1000
        self.__data = [None]*self.__size
        self.__top = -1

    def isEmpty(self):
        ### if top value is -1, then stack is empty
        return self.__top == -1

    def push(self, item):
        ### check if stack is full. 
        # If not, increment top pointer and assign item value to the top pointer position in the data list
        if not self.__top == self.__size - 1:
            self.__top += 1
            self.__data[self.__top] = item
            return True
        return 'Stack is full'
        
    def pop(self):
        ### check if stack is not empty
        ### if not, then save the element at top position, decrement top pointer and return the element

        if not self.isEmpty():
            elem = self.__data[self.__top]
            self.__data[self.__top] = None
            self.__top -= 1
            return elem
        return 'Stack is empty'
    
    def peek(self):
        ### return the top element from the stack, if stack is non-empty
        if not self.isEmpty():
            return self.__data[self.__top]
        else:
            return 'Stack is empty'

    def size(self):
        return self.__size

    def show(self):
        return self.__data
         

s = myStack()
s.push('1')
s.push('2')
s.push('3')
print(s.peek())
s.push('4')
s.push('5')
print(s.show())
print(s.pop())
print(s.pop())
print(s.pop())
print(s.pop())
print(s.pop())
print(s.peek())
print(s.show())


    

