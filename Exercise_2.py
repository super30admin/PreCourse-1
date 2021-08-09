class Node:
    def __init__(self, data):
        self.data = data
        self.next = None


class Stack:
    def __init__(self):
        self.head = None

    def push(self, data):
        new_node = Node(data)
        curr_node = self.head
        if self.head is None:
            self.head = new_node

        else:

            while curr_node:
                # print(curr_node.data)
                if curr_node.next is None:
                    # print("in if")
                    curr_node.next = new_node
                    break
                curr_node = curr_node.next
            # print(self.head.next.data,curr_node.next.data)

    def pop(self):
        curr_node = self.head
        if self.head is None:
            return None
        elif self.head.next is None:
            target_node = self.head.data
            self.head = None
            return target_node
        else:

            target_node = 0
            prev_node = self.head

            while curr_node:
                # print(curr_node.data)
                if curr_node.next is None:
                    # print("in if")
                    target_node = curr_node.data
                    curr_node = None
                    prev_node.next = None

                    return target_node
                prev_node = curr_node
                curr_node = curr_node.next


a_stack = Stack()
while True:
    # Give input as string if getting an EOF error. Give input like "push 10" or "pop"
    print('push <value>')
    print('pop')
    print('quit')
    do = input('What would you like to do? ').split()
    # Give input as string if getting an EOF error. Give input like "push 10" or "pop"
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
