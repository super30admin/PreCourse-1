class Node:
    def __init__(self, data):
        self.data = data
        self.next = None


class Stack:
    def __init__(self, head=None):
        self.head = head

    def push(self, data):
        if self.head is None:
            self.head = Node(data)
            return
        else:
            iterator = self.head
            while iterator:
                if iterator.next is None:
                    iterator.next = Node(data)
                    return
                iterator = iterator.next

    def pop(self):
        if self.head is None:
            print('Cannot pop from empty stack!')
            return
        else:
            itr = self.head
            prev = Node(None)
            while itr:
                curr = itr
                if itr.next is None:
                    prev.next = None
                    return curr.data
                prev = curr
                itr = itr.next

    def print(self):
        itr = self.head
        new_list = []
        while itr:
            new_list.append(itr.data)
            itr = itr.next
        return new_list


a_stack = Stack()
while True:
    print('push <value>')
    print('pop')
    print('print_stack')
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
    elif operation == 'print_stack':
        print(a_stack.print())
    elif operation == 'quit':
        break
