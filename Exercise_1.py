# Note: Time and space complexity provided in the comment
# section of each stack function implemented

class myStack:

     # initializes stack
     # Time Complexity - O(1)
     # Space complexity - O(1)
     def __init__(self):
        self.stack = []


    # checks if stack is empty by checking the length of stack list
    # time complexity - O(1)
    # space complexity - O(1)
     def isEmpty(self):
        if len(self.stack) == 0:
            return True
        return False


     # appends new element 'item' to the end of the stack
     # time complexity - O(1)
     # space complexity - O(1)
     def push(self, item):
        self.stack.append(item)


     # checks if stack is empty. If not empty then removes the element from the top of the stack
     # list and returns it. If empty then prints and returns -1
     # time complexity - O(1)
     # space complexity - O(1)
     def pop(self):
        if not self.isEmpty():
            return self.stack.pop()
        print("Stack Empty")
        return -1


     # checks if stack is empty. If not empty then returns the element value present at top of
     # the stack list. If empty then prints and returns -1
     # time complexity - O(1)
     # space complexity - O(1)
     def peek(self):
        if not self.isEmpty():
            return self.stack[-1]
        print("Stack Empty")
        return -1


     # returns the size of stack list
     # time complexity - O(1)
     # space complexity - O(1)
     def size(self):
        return len(self.stack)


     # returns all the elements present in the stack in the LIFO order
     # time complexity - O(n)
     # space complexity - O(n)
     def show(self):
        items = []
        for i in range(len(self.stack) - 1, -1, -1):
           items.append(self.stack[i])
        return items
         

s = myStack()
s.push('11')
s.push('12')
print(s.pop())
print(s.pop())
print(s.peek())
print(s.size())
print(s.show())
