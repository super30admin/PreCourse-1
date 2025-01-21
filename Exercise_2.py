"""
Time Complexity : O(1)
Space Complexity : O(n)
"""


class Node:
    def __init__(self, data):
        self.data = data
        self.next = None


class Stack:
    def __init__(self):
        # define head of LinkedList
        self.head = None

    def push(self, data):
        # check if the head is None,
        # if yes, assign the value data to head
        if self.head is None:
            self.head = Node(data)
        else:
            # if head has a value, assign data value to a variable
            new_node = Node(data)
            # next of the new_node is assigned to head
            new_node.next = self.head
            # head is now the data
            self.head = new_node

    def pop(self):
        # if no head, then return -1
        if self.head is None:
            return None
        else:
            # assign the value of head to a new variable pop_item
            pop_item = self.head.data
            # since head is to be popped, assign head.next to head
            self.head = self.head.next
            return pop_item


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
