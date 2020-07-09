#Implement Stack using Linked List.

class Node:
    def __init__(self, data):
       self.data = data
       self.next = None


class Stack:
    def __init__(self):
        node = Node(None)
        self.head = node


    def push(self, data):
        if self.head == None:
            self.head= Node(data)
        else:
            node = Node(data)
            node.next = self.head
            self.head = node

        self.show()

    def pop(self):
        pop_val = self.head.data
        self.head = self.head.next
        self.show()
        return pop_val

    def show(self):
        print("Current stack: ")
        ptr = self.head
        while ptr.next:
            print(ptr.data)
            ptr = ptr.next



a_stack = Stack()
a_stack.show()

while True:
    print('push <value>')
    print('pop')
    print('quit')
    do = input('What would you like to do? ').split()
 
    operation = do[0].strip().lower()
    if operation == 'push':
        a_stack.push(int(do[1]))
        #a_stack.show()
    elif operation == 'pop':
        popped = a_stack.pop()
        if popped is None:
            print('Stack is empty.')
        else:
            print('Popped value: ', int(popped))

    elif operation == 'quit':
        break
