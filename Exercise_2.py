# Time Complexity:
# -push: O(1)
# -pop: O(1)
# Space Complexity: O(n) (for storing elements in the list)
class Node:
    def __init__(self, data):
        self.data = data
        self.next = None

class Stack:
    def __init__(self):
        self.top = None

    def push(self, data):
        #Create a new node and push it to the top of the stack
        new_node = Node(data)
        new_node.next = self.top
        self.top = new_node

    def pop(self):

        # If the stack is empty, return None else pop the top element and return the data of the popped node
        if self.top is None:
            return None
        popped_node = self.top
        self.top = self.top.next
        return popped_node.data
        
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

    