class Node:
    def __init__(self, data):
        self.data = data
        self.next = None


class Stack:

    # Initializing a Stack
    def __init__(self):
        self.head = None

    # Push a value into the head of the stack
    def push(self, data):

        if self.head is None:
            self.head = Node(data)
        else:
            new_node = Node(data)
            new_node.next = self.head
            self.head = new_node

    # Remove and return a value in the head of the stack
    def pop(self):

        if self.head is None:
            return None
        else:
            remove = self.head.data
            self.head = self.head.next
            return remove


a_stack = Stack()
while True:
    print("push <value>")
    print("pop")
    print("quit")
    do = input("What would you like to do? ").split()

    operation = do[0].strip().lower()
    if operation == "push":
        a_stack.push(int(do[1]))
    elif operation == "pop":
        popped = a_stack.pop()
        if popped is None:
            print("Stack is empty.")
        else:
            print("Popped value: ", int(popped))
    elif operation == "quit":
        break