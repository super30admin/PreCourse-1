# Time Complexity : Individual push and pop operation will take constant amount of time
# Space Complexity :
class Node:
    def __init__(self, data):
       self.data = data
       self.next = None
 
class Stack:
    def __init__(self):
        '''Initially top is not addressing to any node. top variable will always point to the top/latest Stack element'''
        self.top = None

    def push(self, data):
        '''1. Create a new node
           2. Assign the node.data = input data
           3. Assign node.next = Previous node's address
           4. Assign address of that newly created node to top'''
        node = Node(data)
        node.next = self.top
        self.top = node

    def pop(self):
        '''pop the first node of the Linked List'''
        self.top = self.top.next
        return self.top.data

a_stack = Stack()
while True:
    #Give input as string if getting an EOF error. Give input like "push 10" or "pop"
    print('push <value>')
    print('pop')
    print('quit')
    do = input('What would you like to do? ').split()
    #Give input as string if getting an EOF error. Give input like "push 10" or "pop"
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
