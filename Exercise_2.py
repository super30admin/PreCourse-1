# stack using singly Linked List
# Time Complexity for push() = O(1) because insertion happens at the head of the linked list, it's a constant-time operation
# Time complexity for pop() = O(1) because deletion happens at the head, it takes constant time
# Space Complexity O(n) as stacks stores the n elements


class Node:
    def __init__(self, data):
        self.data = data
        self.next = None


class Stack:
    def __init__(self):
        self.head = None  # pointing at the top of the stack

    def push(self, data):
        new_node = Node(data)  # create new Node
        new_node.next = self.head  # new node's next is the current head/top
        self.head = new_node  # make new node the new top

    def pop(self):
        if not self.head:
            return None  # pop from empty stack
        popped_node = self.head
        self.head = self.head.next  # moving head to the next node
        return popped_node.data  # return the popped head's data


a_stack = Stack()
while True:
    # Give input as string if getting an EOF error. Give input like "push 10" or "pop"
    print("push <value>")
    print("pop")
    print("quit")
    do = input("What would you like to do? ").split()
    # Give input as string if getting an EOF error. Give input like "push 10" or "pop"
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
