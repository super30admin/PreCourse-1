class Node:
    def __init__(self, data):
       self.data = data
       self.next = None
 
class Stack:
    def __init__(self):
        self.head = Node(None)
        self.tail = self.head

    def push(self, data):
        self.tail.next = Node(data)
        self.tail = self.tail.next
        
    def pop(self):
        pointer = self.head
        if pointer.next is None: return None

        while pointer.next.next:
            pointer = pointer.next
        
        data = self.tail.data
        self.tail = pointer
        self.tail.next = None
        return data
        
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
        break
