#Time Complexity : O(N)
#Space Complexity : O(N)
#Any problem you faced while coding this : No
class myStack:
    def __init__(self):
        #intialize an empty stack
        self.stack=[]

    def isEmpty(self):
        # check for empty stack and return true  else return flase
        return self.stack==[]

    def push(self, item):
        # adding items to the stack
        self.stack.append(item)

    def pop(self):
        # if stack not empty pop the last element and delete that item from the stack
        if(not self.isEmpty()):
            lastElement = self.stack[-1] #Save the last element to return
            del(self.stack[-1]) #Remove the last element
            return lastElement
        else:
            return("Stack is Empty")

    def peek(self):
        if len(self.items) == 0:
            print('Stack is Empty')
        print(self.items[len(self.items) - 1])
    def size(self):
        return self.size
    def show(self):
        return self.stack

s = myStack()
s.push('1')
s.push('2')
s.push('3')
s.push('4')
s.push('5')
print(s.pop())
print(s.show())
