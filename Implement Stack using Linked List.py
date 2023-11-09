class Node:
    def __init__(self, data):
        self.data = data
        self.next = None


class Stack:
    def __init__(self):
        self.head = None

    def display(self):
        t = self.head
        print("Stack Element is: [", end='')
        while t:
            print(t.data, end = ',')
            t = t.next
        print(']')

    def push(self, data):
        # Time complexity : O(1)
        if self.head is None:
            self.head = Node(data)
        else:
            temp = Node(data)
            temp.next = self.head
            self.head = temp
        self.display()

    def pop(self):
    # Time complexity : O(1)
        if self.head is None:
            print('Empty Stack')
            return None

        else:
            popped = self.head.data
            self.head = self.head.next
            return popped


a_stack = Stack()

while True:
    # Give input as string if getting an EOF error. Give input like "push 10" or "pop"
    print('push ')
    print('pop')
    print('quit')
    do = input('What would you like to do? ')
    # Give input as string if getting an EOF error. Give input like "push 10" or "pop"
    if do.strip() == 'push':
        i = int(input('Enter a number to push: '))
        a_stack.push(i)
    elif do.strip() == 'pop':
        popped = a_stack.pop()
        if popped is None:
            print('Stack is empty.')
        else:
            print('Popped value: ', int(popped))
        a_stack.display()
    elif do.strip() == 'quit':
        break

if __name__ == '__main__':
    main()
