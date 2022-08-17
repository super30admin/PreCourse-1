# Time Complexities
# push: O(1)
# pop: O(1)

class Node:
    def __init__(self, data):
       self.data = data
       self.next = None
 
class Stack:
    def __init__(self):
        self.is_empty = True
        
    def push(self, data):
        if self.is_empty:
            self.is_empty = False
            self.first = Node(data)
        curr = Node(data)
        curr.next = self.first
        self.first = curr

        
    def pop(self):
        if self.is_empty:
            return None
        ret_node = self.first
        self.first = self.first.next
        return ret_node.data
        
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
