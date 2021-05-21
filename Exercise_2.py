class Node:
    def __init__(self, data, next = None):
       self.data = data
       self.next = next

class Stack:
    def __init__(self):
        self.head = Node('this is actually tail')
        self.max_len = 10000 # limiting to a number. Not necessary if you want to provide freedom to the user to
        # use your entire heap size
        self.len_ = 0 # to keep track of the current length

    def push(self, data):
        if self.len_ >= self.max_len:
            print('Stack size reached, {} cannot be pushed'.format(data))
        else:
            new_node = Node(data, self.head)
            self.head = new_node
            self.len_ += 1

    def pop(self):
        if self.len_ <= 0:
            print('Nothing to pop')
            return
        else:
            result = self.head.data
            self.head = self.head.next
            self.len_ -= 1
            return result

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

'''
n = number of elements in the stack
Space Complexity: O(n)

Time Complexity:
push: O(1) in worst case which is better than array implementation
pop: O(1)
'''