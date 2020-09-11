# Exercise_2 : Implement Stack using Linked List.


class Node:
    # Node of a Linked List
    def __init__(self, data=0, next=None):
       self.data = data
       self.next = next


class Stack:
    def __init__(self):
        # Head is Null by default
        self.head = None

    # Check if stack is empty
    def isEmpty(self):
        if self.head == None:
            return True
        else:
            return False
        
    def push(self, data):
        if self.head is None:
            self.head = Node(data)
        else:
            newnode = Node(data)
            newnode.next = self.head
            self.head = newnode

    def pop(self):
        if self.isEmpty():
            return None
        else:
            poppednode = self.head
            self.head = self.head.next
            poppednode.next = None
            return poppednode.data

    def peek(self):
        if self.isEmpty():
            return None
        else:
            return self.head.data

    def show(self):
        headnode = self.head
        if self.isEmpty():
            print("Stack is empty")
        else:
            while headnode is not None:
                print(headnode.data, "->", end=" ")
                headnode = headnode.next
        return


# Driver code
a_stack = Stack()
while True:
    print('push <value>')
    print('pop')
    print('peek')
    print('show')
    print('quit')
    do = input('What would you like to do? ').split()
 
    operation = do[0].strip().lower()
    if operation == 'push':
        a_stack.push(int(do[1]))
    elif operation == 'pop':
        popped = a_stack.pop()
        if popped is None:
            print('Stack is empty.')
        else:
            print('Popped value: ', int(popped))
    elif operation == 'peek':
        peek = a_stack.peek()
        if peek is None:
            print('Stack is empty')
        else:
            print('Peek value: ', int(peek))
    elif operation == 'show':
        a_stack.show()
    elif operation == 'quit':
        break
