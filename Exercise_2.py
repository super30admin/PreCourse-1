
class Node:
    def __init__(self, data):
        self.data = data
        self.next = None


class Stack:
    """
        create a stack.
        Takes O(1) time.
    """

    def __init__(self):
        self.head = Node(0)

    """
        Push element to stack.
        Takes O(n) time.
    """

    def push(self, data):
        curr = self.head

        while curr:
            prev = curr
            curr = curr.next
        prev.next = Node(data)

    """
        Push element from stack.
        Takes O(n) time.
    """

    def pop(self):
        if self.head.next == None:
            return None
        curr = self.head

        while curr.next:
            prev = curr
            curr = curr.next
        prev.next = None
        return curr.data


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
