class myStack:
    def __init__(self):
        self.stack =[]
        self.size = 0
    def isEmpty(self):
        return(self.size == 0)
    def push(self, data):
        self.stack.append(data)
        self.size += 1
    def peek(self):
        if self.isEmpty():
            return None
        else:
            return self.stack[-1]
    def show(self):
        return self.stack
    def pop(self):
        if self.isEmpty():
            return None
        else:
            self.size -= 1
            return self.stack.pop(-1)
    
            
        
a_stack = myStack()
while True:
    #Give input as string if getting an EOF error. Give input like "push 10" or "pop"
    print('push <value>')
    print('pop')
    print('peek')
    print('isEmpty')
    print('show')
    print('quit')
    print('size')
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
            print('Popped value: ', int(popped))
    elif operation == 'peek':
        print(a_stack.peek())
    elif operation == 'show':
        print(a_stack.show()) 
    elif operation == 'isempty':
        print(a_stack.isEmpty())        
    elif operation == 'quit':
        break
    elif operation == 'size':
        print(a_stack.size)
    else:
        print('please enter a valid input')    