# Time Complexity :
#                   push(): O(1)
#                   pop(): O(1)
# Space Complexity : O(n)
class Node:
    def __init__(self, data):
       self.data = data
       self.next = None
 
class Stack:
    def __init__(self):
        self.stack_head = None
        
    def push(self, data):
        if self.stack_head is None: # top_node is empty
            self.stack_head = Node(data)
        else:
            new_node = Node(data)
            new_node.next = self.stack_head
            self.stack_head = new_node
        
    def pop(self):
        if self.stack_head:
            value = self.stack_head.data
            self.stack_head = self.stack_head.next
            return value
        return None

        
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
