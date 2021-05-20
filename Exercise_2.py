class Node:
    def __init__(self, data):
        self.data = data
        self.next = None


class Stack:
    def __init__(self):

        self.head = None

    # push operation adds specific value to the stack
    # time complexity is O(1)
    def push(self, data):
        if self.head is None:
            self.head = Node(data)
        else:
            add_node = Node(data)
            add_node.next = self.head
            self.head = add_node

    # time complexity is O(1)
    def isEmpty(self):
        if self.head is None:
            return True
        else:
            return False

    # time complexity is O(1)
    def pop(self):
        if self.isempty():
            return None
        else:
            # pop operation removes the top most value of the stack
            remove_node = self.head
            self.head = self.head.next
            remove_node.next = None
            return remove_node.data


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
