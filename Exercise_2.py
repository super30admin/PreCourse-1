#               Time        Space
# push():       O(N)        O(1)
# pop():        O(N)        O(1)

class Node:
    def __init__(self, data):
       self.data = data
       self.next = None

class Stack: # LIFO data struct
    def __init__(self):
        self.head = None # top of stack
        self.length = 0

    def push(self, data):
        new = Node(data)
        # insert at the top of stack (end of linked list)
        if not self.head:
            self.head = new
        else:
            curr_node = self.head
            # traverse to the last node
            while curr_node.next:
                curr_node = curr_node.next
            curr_node.next = new
        self.length += 1
        print(f"added {data} to the top of stack")

    def pop(self):
        # remove from the top of stack (end of linked list)
        if not self.head:
            print(f"Empty stack, nothing to pop")
            return None
        else:
            prev_node = None
            curr_node = self.head
            # remove last node
            while curr_node.next:
                prev_node = curr_node
                curr_node = curr_node.next
            data = curr_node.data
            self.length -= 1
            if self.length > 0:
                prev_node.next = None
            else:
                self.head = None
            return data

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
