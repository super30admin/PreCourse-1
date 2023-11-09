class Node:
    def __init__(self, data):
        self.data = data
        self.next = None


class Stack:
    def __init__(self):
        self.head = None        # initializing head as none i.e empty linked list

    def push(self, data):
        new_node = Node(data)
        new_node.next = self.head
        self.head = new_node        # adding node to the front of linked list


    def pop(self):
        if self.head is None:       # Empty linked list return none
            return None
        else:
            val = self.head.data        # popping from the front of linked list and returning the data from the node
            self.head = self.head.next
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
