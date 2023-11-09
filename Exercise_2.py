# Time compleity: O(1)
# Space complexity: O(n) for n input elements

class Node:
    def __init__(self, data):
        self.data = data
        self.next = None


class Stack:
    # performing stack operations on the head for O(1) time complexity
    def __init__(self):
        self.head = None

    def push(self, data):
        newNode = Node(data)
        # if stack is empty, point the head to newNode
        if not self.head:
            self.head = newNode
        else:
            # otherwise point newNode's next to head and then make newNode the new head
            newNode.next = self.head
            self.head = newNode

    def pop(self):
        # if the stack is empty: return None
        if not self.head:
            return None
        # otherwise, pop the head element and change the head to point to its next element
        node = self.head
        self.head = self.head.next
        return node.data


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
