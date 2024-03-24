
class Node:
    def __init__(self, data):
       self.data = data
       self.next = None
 
class Stack:
    def __init__(self):
        # Time Complexity: O(1)
        # Space Complexity: O(1)

        self.head = None
        
    def push(self, data):
        # Time Complexity: O(1)
        # Space Complexity: O(1)
        
        curr_node = Node(data)
        curr_node.next = self.head
        self.head = curr_node
        
    def pop(self):
        # Time Complexity: O(1)
        # Space Complexity: O(1)
        if not self.head:
            return
        else:
            temp = self.head
            self.head = self.head.next
            temp.next = None
            return temp.data
        
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
