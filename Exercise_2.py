class Node:
   

    def __init__(self, data):
       self.data = data
       self.next = None

        self.data = data
        self.next = None


class Stack:
    def __init__(self):

        self.head = None

    def push(self, data):

        new_node = Node(data)
        if self.head is None:
            self.head = new_node
        else:
            new_node.next = self.head
            self.head = new_node
    def pop(self):

        if self.head is None:
            return None
        popped_value = self.head.data
        self.head = self.head.next
        return popped_value


a_stack = Stack()
while True:
    
    print('push <value>')
    print('pop')
    print('quit')
    do = input('What would you like to do? ').split()
    
    operation = do[0].strip().lower()
    if operation == 'push':
        a_stack.push(int(do[1]))
