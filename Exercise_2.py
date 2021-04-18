class Node:
    def __init__(self, data):
       self.data = data
       self.next = None

class Stack:
    def __init__(self):
        self.__head = None
        self.__size = 0

    def push(self, data):
        node = Node(data)
        node.next = self.__head
        self.__head = node
        self.__size = self.__size+1

    def pop(self):
        val = self.__head.data
        self.__head = self.__head.next
        self.__size = self.__size -1
        return val

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
