class Node:
    def __init__(self, data):
       self.data = data
       self.next = None
 
class Stack:
    def __init__(self):
        self.head = None


    def push(self, data):
        if self.head == None:
            self.head = Node(data)
        else:
            n_node = Node(data)
            n_node.next = self.head
            self.head = n_node
        
    def pop(self):
        if self.head == None: #Stack Underflow
            return None

        else:
            node_pop = self.head
            self.head = self.head.next
            return node_pop.data

    def peek(self):
        if self.head == None:
            return None
        else:
            return self.head.data


a_stack = Stack()
while True:
    print('push <value>')
    print('pop')
    print('display')
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
    elif operation == 'display':
        node = a_stack.head
        while node:
            print(node.data)
            node = node.next
    elif operation == 'quit':
        break
