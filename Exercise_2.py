class Node:
    def __init__(self, data):
       self.data = data
       self.next = None
 
class Stack():
    def __init__(self):
        self.head = Node("head")
        self.size =0
        
    def push(self, data):
        node = Node(data)
        node.next=self.head
        self.head=node
        self.size+=1
        
    def pop(self):
        poppednode = self.head
        self.head = self.head.next
        poppednode.next = None
        return poppednode.data
        

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
            print(int(popped))
    elif operation == 'quit':
        break
