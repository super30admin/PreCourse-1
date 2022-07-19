'''Time Complexity:
    push() - O(1) as we are just appending the item at the end in stack 
    pop() - O(1) as we are removing the last item in the stack
    show() - O(1) as we are just displaying the stack

    Space Complexity:
    O(n) as there are n elements in the stack
'''


class Node:
    def __init__(self, data):
        self.data = data
        self.next = None


class Stack:
    def __init__(self):
        self.head = None

    def push(self, data):
        if self.head == None:
            self.head = Node(data)
        else:
            tmp = Node(data)
            tmp.next = self.head
            self.head = tmp

    def pop(self):
        if self.head == None:
            return None
        else:
            tmp_popped = self.head
            self.head = self.head.next
            tmp_popped.next = None
        return tmp_popped.data

    def show(self):
        if self.head == None:
            print("Empty stack")
        else:
            tmp = self.head

            while(tmp != None):
                print(tmp.data)
                tmp = tmp.next
            return


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
    print(a_stack.show())
