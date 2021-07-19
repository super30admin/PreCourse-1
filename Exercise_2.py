class Node:
    def __init__(self, data):
       self.data = data
       self.next = None
 
class Stack:
    def __init__(self):
        self.top = None
        self.start = None

    def push(self, data):
        new_node = Node(data)
        # Assuming no overflow error.
        if self.start is None:
            self.start = self.top = new_node
        else:
            temp = self.start
            while temp.next is not None:
                temp = temp.next
            temp.next = new_node
            self.top = new_node

    def pop(self):
        if self.start is None: # Stack Empty
            raise IndexError("Underflow Error. Stack is empty.")
        elif self.start.next is None:   # One element left in stack
            self.start = None
        else: # Iterate and delete
            temp = self.start
            previous = None
            while temp.next is not None:
                previous = temp
                temp = temp.next
            previous.next = None
            print(f"deleted: {temp.data}")
            return temp.data

    def print(self):
        '''print Function definition. '''
        temp = self.start
        if temp is None:
            print("Stack is Empty.")
            return
        while temp.next is not None:
            print(temp.data, end='->')
            temp = temp.next
        print(temp.data, end='<-TOP\n')

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
