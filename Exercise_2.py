class Node:
    def __init__(self, data):
        self.data = data
        self.next = None


class Stack:
    def __init__(self):
        self.head = None
        self.curent = None

    def push(self, data):
        temp = Node(data)
        if self.head == None:
            self.head, self.current = temp, temp
        else:
            self.current.next = temp
            self.current = self.current.next

    def pop(self):

        temp = self.head
        if temp != None:
            val = temp.data
            if temp == self.current:
                self.head, self.current = None, None
                return val
            else:
                while (temp.next != self.current):
                    temp = temp.next
                val = temp.next.data
                temp.next = None
                self.current = temp
                return val


a_stack = Stack()
while True:
    # Give input as string if getting an EOF error. Give input like "push 10" or "pop"
    print('push <value>')
    print('pop')
    print('quit')
    do = input('What would you like to do? ').split()
    # Give input as string if getting an EOF error. Give input like "push 10" or "pop"
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
