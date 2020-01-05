class Node:
    def __init__(self, data):
        self.data = data
        self.next = None

    def __str__(self):
        return f'{self.data}'


class Stack:
    '''
        Time Complexity: Constant O(1)
        Space Complexity: Constant O(1)
    '''

    def __init__(self):
        self.top = None
        self.stack_size = 0

    '''
        Time Complexity: Constant O(1)
        Space Complexity: Constant O(1)
    '''

    def isEmpty(self):
        return self.stack_size == 0

    '''
        Time Complexity: Constant O(1)
        Space Complexity: Constant O(1)
    '''

    def push(self, data):
        node = Node(data)
        if self.top:
            node.next = self.top
        self.top = node
        self.stack_size += 1

    '''
        Time Complexity: Constant O(1)
        Space Complexity: Constant O(1)
    '''

    def pop(self):
        if self.top:
            data = self.top.data
            if self.top.next:
                self.top = self.top.next
            else:
                self.top = None
            self.stack_size -= 1
            return data
        else:
            return None

    '''
        Time Complexity: Constant O(1)
        Space Complexity: Constant O(1)
    '''

    def peek(self):
        return self.top.data if self.top else None

    '''
        Time Complexity: Constant O(1)
        Space Complexity: Constant O(1)
    '''

    def size(self):
        return self.stack_size

    '''
        Time Complexity: Linear O(n)
        Space Complexity: Constant O(1)
    '''

    def show(self):
        cur = self.top
        result = ''
        while cur:
            result += f'{cur} '
            cur = cur.next
        return result


a_stack = Stack()
while True:
    print('push <value>')
    print('pop')
    print('peek')
    print('isEmpty')
    print('show')
    print('size')
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
    elif operation == 'isempty':
        print(a_stack.isEmpty())
    elif operation == 'peek':
        print(a_stack.peek())
    elif operation == 'show':
        print(a_stack.show())
    elif operation == 'size':
        print(a_stack.size())
    elif operation == 'quit':
        break
