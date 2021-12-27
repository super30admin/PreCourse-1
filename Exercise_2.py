# Implement stack as a linked list

class Node:
    def __init__(self, data):
       self.data = data
       self.next = None

class Stack:
    def __init__(self):
        self.head = None

# In order to maintain Push operation as O(1) I am adding the new node to the front of the list
    def push(self, data):
        if self.head == None:
            newNode = ListNode(data)
            self.head = NewNode
        else:
            newNode = ListNode(data)
            newNode.next = self.head
            self.head = newNose

# In order to maintain Pop operation as O(1) I am removing the node to the front of the list (where last added would be)
    def pop(self):
        if self.head == None:
            return None
        else:
            temp = self.head
            self.head = self.head.next
            temp.next = None
            return temp.data

    def peek(self):
        if self.head == None:
            return None
        else:
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
