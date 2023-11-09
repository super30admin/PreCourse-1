# Time Complexity: O(1) for push and pop.
# Space Complexity: O(1) for push and pop.
# Yes, runs successfully on LeetCode.
# No issues faced.

class Node:
    def __init__(self, data):
       self.data = data
       self.next = None
 
class Stack:
    def __init__(self):
        self.stack = None
        
    def push(self, data):
        new_node = Node(data)
        if self.stack is None:
            self.stack = new_node
        else:
            new_node.next = self.stack
            self.stack = new_node
        
    def pop(self):
        if self.stack is None:
            return None
        else:
            popped = self.stack.data
            self.stack = self.stack.next
            return popped
        
a_stack = Stack()
while True:
    #Give input as string if getting an EOF error. Give input like "push 10" or "pop"
    print('push <value>')
    print('pop')
    print('quit')
    do = input('What would you like to do?').split()
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