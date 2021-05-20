'''

NOTEES:


PUSH AND POP NEEDS TO BE FROM ONE END.
HENCE, IN LL implementation - PUSH AND POP IS DONE FROM THE START OF THE LL.
THIS ACHIEVES O(1) for PUSH AND POP. OTHERWISE if we insert and delete at the end of LL,
it will be O(N)


REFERNCE CODE: https://www.geeksforgeeks.org/implement-a-stack-using-singly-linked-list/

'''

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
            '''What is wrong here? Original code.
            self.new_node = Node(data)
            self.new_node.next = self.head.next
            self.head = self.new_node
            '''
            self.new_node = Node(data)
            self.new_node.next = self.head
            self.head = self.new_node


    def pop(self):
        if self.head == None:
            return None
        else:
            self.node_to_remove = self.head
            self.head = self.head.next
            self.node_to_remove.next = None
            return self.node_to_remove.data

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
