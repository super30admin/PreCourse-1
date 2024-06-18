
class Node:
    def __init__(self, data):
        self.data = data
        self.next = None


class Stack:
    def __init__(self):
        self.top = None

    def push(self, data):
        node = Node(data)

        if self.top == None:
            self.top = node

        else:
            current_node = self.top
            self.top = node
            self.top.next = current_node

    def pop(self):

        if self.top is None :
            print("Stack is empty")

        elif self.top.next is None :

            value = self.top.data
            self.top = None

            return value

        else :
            temp = self.top
            value = self.top.data
            self.top = temp.next

            return value


a_stack = Stack()
#
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



# a_stack.push(10)
# a_stack.push(20)
# a_stack.push(30)
#
# a_stack.pop()
#
