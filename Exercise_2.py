class Node:
    def __init__(self, data):
       self.data = data
       self.next = None
 
class Stack:
    def __init__(self):
        self.top = None
        
    def push(self, data):
        if self.top == None:
            self.top = Node(data)
            self.top.next = None
            return 0
        temp = Node(data)
        temp.next = self.top
        self.top = temp
        return 0
            
        
    def pop(self):
        if self.top == None:
            return None
        elif self.top.next == None:
            data = self.top.data
            self.top = None
            return data
        data = self.top.data
        self.top = self.top.next
        return data
        
    def show(self):
        while self.top.next:
            print(self.top.data)
            self.top = self.top.next
        if self.top.next == None:
            print(self.top.data)
            
        
a_stack = Stack()
while True:
    print('push <value>')
    print('pop')
    print('quit')
    do = input('What would you like to do? ').split()
 
    operation = do[0].strip().lower()
    if operation == 'push':
        a_stack.push(int(do[1]))
    elif operation == 'pop':
        popped = a_stack.pop()
        if popped is None:
            print('Stack is empty.')
        else:
            print('Popped value: ', int(popped))
    elif operation == 'quit':
        a_stack.show()
        break
