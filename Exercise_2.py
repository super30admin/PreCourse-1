# Time Complexity - O(n)      Space Complexity - O(n)
class Node:
    def __init__(self, data):
       self.data = data
       self.next = None
 
class Stack:
    def __init__(self):
        self.head = None
        self.stack = []

    def push(self, data):
        new_node = Node(data)
        if self.head is None:
            self.head = new_node
            self.stack.append(new_node.data)
        else:
            temp = self.head
            while temp.next is not None:
                temp = temp.next
            self.stack.append(new_node.data)
            temp.next = new_node

    def pop(self):
        if self.head is None:
            return None
        elif self.head.next is None:
            x = self.head.data
            self.head = None
            self.stack.remove(x)
            return x
        else:
            temp = self.head
            while temp.next is not None:
                prev = temp
                temp = temp.next
            x = temp.data
            self.stack.remove(temp.data)
            prev.next = None
            return x

    def printList(self):
        temp = self.head
        if self.head is None:
            print(None)
        while temp:
            print(temp.data, end=" ")
            temp = temp.next
        print()


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
        print()
        print('Stack is', a_stack.stack)
        print('Linked list is', end=" ")
        a_stack.printList()
        print()
    elif operation == 'pop':
        popped = a_stack.pop()
        if popped is None:
            print()
            print('Stack is empty.')
            print()
        else:
            print()
            print('Popped value:', int(popped))
            print('Stack is', a_stack.stack)
            print('Linked list is', end=" ")
            a_stack.printList()
            print()
    elif operation == 'quit':
        break