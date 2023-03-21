class Node:
    def __init__(self, data):
        self.data = data
        self.next = None


class Stack:
    def __init__(self):
        self.top = None

    def push(self, data):

        if self.top is None:
            new = Node(data)
            self.top = new
        else:
            new = Node(data)      #pushing values on the linkedlist wrost case tc: O(1)  and sc: O(1)
            temp = self.top
            new.next = temp
            self.top = new

    def pop(self):
        temp = self.top
        self.top = temp.next       #tc : 0(1) sc:0(1)
        temp.next = None


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
