
class Node:
    def __init__(self, data):
       self.data = data
       self.next = None
 
class Stack:
    def __init__(self):
        self.top = None

    # Create a new Node
    # Set its next pointer to head
    # Update the Head to the New Node
    # T: O(1), S: O(n)
    def push(self, data):
        newNode = Node(data)
        newNode.next = self.top
        self.top = newNode
        print(f"Pushed: {data}")

    # T: O(1), S: O(n)
    # Check if the Head is null
    # If not, update the Head to Head.next
    def pop(self):
        if not self.top:
            print("Stack Underflow: Cannot pop from an empty stack.")
            return None
        poppedData = self.top.data
        self.top = self.top.next
        print(f"Popped: {poppedData}")
        return poppedData

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
