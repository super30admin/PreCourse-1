import os
class Stack:
    def __init__(self):
        self.items=[]

    def push(self, data):
        self.items.append(data)
        print("Item pushed into the stack!\n")


    def pop(self):
        if not self.items:
            return
        else:
            return self.items.pop()

a_stack = Stack()
while True:
    print("push <value>")
    print("pop")
    print("quit")
    do = str(raw_input("What would you like to do?"))
    do = do.split()
    #print(do)
    operation = do[0].lower()
    #print(operation)
    if operation == 'push':
        a_stack.push(int(do[1]))
    elif operation == 'pop':
        popped = a_stack.pop()
        if popped is None:
            print('Stack is empty.\n')
        else:
            print('Popped value: ', int(popped))
            print('\n')
    elif operation == 'quit':
        break
