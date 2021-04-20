class Node:
    def __init__(self, data):
       self.data = data
       self.next = None
 
class Stack:
    def __init__(self):
        self.size = 0

    def push(self, data):
        if self.size == 0:
            self.head = Node(data)
            self.tail = self.head
        else:
            node = self.head
            while node.next:
                node = node.next
            node.next = Node(data)
            self.tail = node.next
        self.size += 1
        
    def pop(self):
        if self.size == 0:
            return
        if self.size == 1:
            data = self.head.data
            self.head = None
            self.tail = self.head
            self.size -= 1
            return data
        node = self.head
        while node.next.next:
            node = node.next
        data = node.next.data
        node.next = None
        self.tail = node
        self.size -= 1
        return data

    def peek(self):
        if self.tail:
            return self.tail.data
    
    def show(self):
        stack = []
        node = self.head
        while node:
            stack.append(node.data)
            node = node.next
        return stack
    
    def size(self):
        return self.size

        
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
            print('>>> Stack is empty.')
        else:
            print('>>> Popped value: ', int(popped))
    elif operation == 'peek':
        peeked = a_stack.peek()
        if peeked is None:
            print('>>> Stack is empty.')
        else:
            print('>>> Peeked value: ', int(peeked))
    elif operation == 'show':
        stack = a_stack.show()
        print(">>> ", stack)
    elif operation.startswith('q') or operation == 'exit':
        break
