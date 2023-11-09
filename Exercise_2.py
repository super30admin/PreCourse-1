# For Push & Pop TIme Complexity is O(1)
# Space complexity is number of values, i.e: O(n)
# Followed https://youtu.be/Ebq7QUPaU7I

class Node:
    def __init__(self, data):
        self.data = data
        self.next = None


class Stack:
    def __init__(self):
        self.head = None
        self.size = 0

    def push(self, data):
        if self.head is None:
            self.head = Node(data)
            self.size += 1
        else:
            newNode = Node(data)
            newNode.next = self.head
            self.head = newNode
            self.size += 1

    def pop(self):
        if self.head is None:
            return None
        else:
            temp = self.head
            self.head = self.head.next
            self.size -= 1
            popped = temp.data
            return popped


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
