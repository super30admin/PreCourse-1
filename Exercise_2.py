class Node:
    def __init__(self, data):
        self.data = data
        self.next = None

class Stack:
    def __init__(self):
        self.head = None

    # Time Complexity: O(N)
    # Space Complexity: O(1)
    def push(self, data):
        new_node = Node(data)
        if self.head is None:
            self.head = new_node
        else:
            temp = self.head
            while temp.next is not None:
                temp = temp.next
            temp.next = new_node

    # Time Complexity: O(N)
    # Space Complexity: Constant time
    def pop(self):
        if self.head is None:
            return None
        elif self.head.next is None:
            tempdata = self.head.data
            self.head = None
            return tempdata
        temp = self.head
        while temp.next.next is not None:
            temp = temp.next
        popping = temp.next.data
        temp.next = None
        return popping

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