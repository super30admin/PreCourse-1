
class Node:
    def __init__(self, data):
       self.data = data
       self.next = None
 
class Stack:
    def __init__(self):
        self.top = Node(None)
        self.size = 0

    def push(self, data):
        if self.top is None:
            self.top = Node(data)
        else:
            data_node = Node(data)
            data_node.next = self.top
            self.top = data_node
        self.size += 1

    def pop(self):
        val = self.head.next
        self.head.next = self.head.next.next
        self.size -= 1
        return val.data

        
a_stack = Stack()
while True:
    #Give input as string if getting an EOF error. Give input like "push 10" or "pop"
    print('push <value>')
    print('pop')
    print('quit')
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
    elif operation == 'quit':
        break
