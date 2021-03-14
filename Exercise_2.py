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
            newnode = Node(data)
            newnode.next = self.head
            self.head = newnode

    def isempty(self):
        if self.head == None:
            return True
        else:
            return False

    def pop(self):
        if self.isempty():
            return None

        else:
            # remove the head node and make the next preceeding node as head
            pop_node = self.head
            self.head = self.head.next
            pop_node.next = None
            return pop_node.data

    def display(self):
        iternode = self.head
        if self.isempty():
            print("Stack Underflow")

        else:
            while (iternode != None):
                print(iternode.data, "->", end = " ")
                iternode = iternode.next
            return


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
    elif operation == 'display':
        a_stack.display()
    elif operation == 'pop':
        popped = a_stack.pop()
        if popped is None:
            print('Stack is empty.')
        else:
            print('Popped value: ', int(popped))
    elif operation == 'quit':
        break
