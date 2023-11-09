class Node:
    def __init__(self, data=None, next=None):
        self.data = data
        self.next = next


class Stack:
    def __init__(self):

        self.head = None

    def push(self, data):

        node = Node(data)

        if self.head is None:
            self.head = node
        else:
            # Creating a Temporary Node
            temp = self.head
            node.next = temp
            self.head = node

    def pop(self):
        if self.head is None:
            return None

        elif self.head.next is None:
            # Creating a Temporary Node
            temp = self.head
            self.head = None
            return temp.data

        else:
            # Creating a Temporary Node
            temp = self.head
            self.head = self.head.next
            return temp.data

    def peek(self):

        if self.head is None:
            return None
        return self.head

    def isEmpty(self):
        return self.head == None

    def printstack(self):

        temp = self.head
        while temp is not None:
            print("{} -> ".format(temp.data))
            temp = temp.next
        print("\n")


a_stack = Stack()
while True:
    # Give input as string if getting an EOF error. Give input like "push 10" or "pop"
    print("push <value>")
    print("pop")
    print("quit")
    print("print")
    print("peek")
    print("isempty")
    do = input("What would you like to do? ").split()
    # Give input as string if getting an EOF error. Give input like "push 10" or "pop"
    operation = do[0].strip().lower()
    if operation == "push":
        a_stack.push(int(do[1]))
    elif operation == "pop":
        popped = a_stack.pop()
        if popped is None:
            print("Stack is empty.\n")
        else:
            print("Popped value: \n", int(popped))
    elif operation == "print":
        a_stack.printstack()
    elif operation == "peek":
        temp = a_stack.peek()
        if temp is not None:
            print("Peeked Element is {}\n".format(temp.data))
        else:
            print("Empty Stack\n")
    elif operation == "isempty":
        empty = a_stack.isEmpty()
        print("Is the Stack Empty {}\n".format(empty))
    elif operation == "quit":
        break
