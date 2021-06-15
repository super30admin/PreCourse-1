class Node:
    def __init__(self, data):
       self.data = data
       self.next = None
 
class Stack:
    def __init__(self):
        self.stack = None
        
    def push(self, data):
        newData = Node(data)

        if self.stack is None:
            self.stack = newData
            return

        iterate = self.stack
        while iterate.next:
            iterate = iterate.next
        iterate.next = newData
        
    def pop(self):

        iterate = self.stack
        if iterate and iterate.next is None:
            pop_value = iterate.data
            self.stack = None
            return pop_value

        if iterate is None:
            return None

        prev_node = None
        while iterate.next:
            prev_node = iterate
            iterate = iterate.next
        pop_value = iterate.data

        prev_node.next = iterate.next
        iterate = None

        return pop_value
        
a_stack = Stack()
while True:
    print('push <value>')
    print('pop')
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
    elif operation == 'quit':
        break
