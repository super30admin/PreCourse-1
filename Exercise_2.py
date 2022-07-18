
class Node:
    def __init__(self, data):
       self.data = data
       self.next = None
 
class Stack:
    def __init__(self):
        self.head = None


    # Traverse through the linked list to insert a element at the end of list
    def push(self, data):
        if self.head == None:
            return None

        traverse = self.head
        while(traverse.next):
            traverse = traverse.next
            traverse.next = Node(data)

    # Traverse through the linked list to delete a element at the end of list
    def pop(self):
        if self.head == None:
            return None

        else:
            # popNode = self.head

            while (self.head.next):
                self.head = self.head.next
            self.head.next = None
            return self.head.data



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
