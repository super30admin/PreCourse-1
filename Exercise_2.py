
class Node:
    def __init__(self, data):
       self.data = data
       self.next = None
 
class Stack:
    __slots__ = '_top'
    def __init__(self):
        self._top = None
        
    def push(self, data):
        #Time complexity - o(1)
        #Space complexity - o(1)

        if self._top is None:
            self._top = Node(data)
        else:
            node = Node(data)
            node.next = self._top
            self._top = node


        
    def pop(self):
        # Time complexity - o(1)
        # Space complexity - o(1)

        if self._top is None:
            return None
        else:
            value = self._top.data
            self._top = self._top.next
            return value
        
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
