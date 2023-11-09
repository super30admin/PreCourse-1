# Time Complexity: In genereal , for push,pop,peek,size is O(1) , because these operations can be done a constant time.
#                  But show it will be O(n) , Here n = no.of elements in the stack.
# Space Compexity: O(n) Here n = no.of elements in the stack. ( Increases dynamically)

class myStack:
    # Please read sample.java file before starting.
    # Kindly include Time and Space complexity at top of each file
    def __init__(self):
        self.stack = []                     # created a empty list

    def isEmpty(self):
        return len(self.stack) == 0         # checking whether the stack is empty or not

    def push(self, item):
        self.stack.append(item)             # pushing or adding item into stack

    def pop(self):
        if self.isEmpty():                          # checking whether the stack is empty or not
            print(" Stack is empty")
        return self.stack.pop()                     # popping or deleting item into stack


    def peek(self):
        if self.isEmpty():                  # checking whether the stack is empty or not
            print(" Stack is empty")
        return self.stack[-1]                   # just returning the last item form the stack

    def size(self):
        return len(self.stack)                  # finding the size of the stack

    def show(self):
        print(self.stack)                       # printing all the items present in the stack



s = myStack()
s.push('1')             
s.push('2')
print(s.pop())
print(s.show())
