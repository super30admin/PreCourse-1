
class Node:
    def __init__(self, data):
       self.data = data
       self.next = None
 
class Stack:
    n = None
    def __init__(self):
        self.n = Node(None)
        
    def push(self, data):
        
        self.n.next = self.n
        self.n.data = data
        # print(self.n.data) 
    def pop(self):
        print(self.n.data)
        self.n = self.n.next
        
        
a_stack = Stack()
while True:
    #Give input as string if getting an EOF error. Give input like "push 10" or "pop"
    print('push <value>')
    print('pop')
    print('quit')
    do = input().split(sep=' ')
    print(do)
    
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
    elif operation == 'quit':
        break
