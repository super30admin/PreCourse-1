
class Node:
    def __init__(self, data):
       self.data = data
       self.next = None
 
class Stack:
    def __init__(self):
        self.head = None
        
    def push(self, data):
        newNode = Node(data)
        newNode.next = self.head
        self.head = newNode
                
    def pop(self):
        if(not self.head):
            return "cannot pop. stack is empty"
        poppedVal = self.head.data
        self.head = self.head.next
        return poppedVal

    def show(self):
        if(not self.head):
            print("stack is empty")
        ptr = self.head
        while(ptr):
            print(ptr.data, end = " ")
            ptr = ptr.next
        print("")
        
a_stack = Stack()

# a_stack.show()
# print("")

# a_stack.push(1)
# a_stack.push(2)
# a_stack.push(3)

# a_stack.show()
# print("")

# print(a_stack.pop())
# a_stack.show()
# print("")

# print(a_stack.pop())
# a_stack.show()
# print("")

# print(a_stack.pop())
# a_stack.show()
# print("")

# print(a_stack.pop())
# a_stack.show()
# print("")



while True:
    #Give input as string if getting an EOF error. Give input like "push 10" or "pop"
    print('push <value>')
    print('pop')
    print('quit')
    print('print')
    do = input('What would you like to do? ').split()
    #Give input as string if getting an EOF error. Give input like "push 10" or "pop"
    operation = do[0].strip().lower()
    if operation == 'push':
        a_stack.push(int(do[1]))
    elif operation == 'pop':
        popped = a_stack.pop()
        if popped is None:
            print('Stack is empty.')
        else:
            print('Popped value: ', popped)
    elif operation == 'print':
        a_stack.show()
    elif operation == 'quit':
        break
