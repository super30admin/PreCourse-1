# // Time Complexity :O(n)
# // Space Complexity : O(n)

class myStack:
  #Please read sample.java file before starting.
  #Kindly include Time and Space complexity at top of each file
    def __init__(self):
        self.items = []     #initializing list

    def isEmpty(self):
        return  True if len(self.items) == 0 else False

    def push(self, item):
        self.items.append(item)                    #add item in the stack

    def pop(self):
        if self.isEmpty():
            return "empty stack"
        return self.items.pop()

    def peek(self):
        if self.isEmpty():
            return "empty stack"
        return self.items[-1]               #last element in the list

    def size(self):
        return len(self.items)     #size of the list

    def show(self):
        return self.items


         

s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
