# Time complexity: push = O(1), pop = O(1)
# Space complexity: push = O(1),pop = O(1)
# Works on Leetcode: Yes
# Problems faced while solving: none
class Node:
    # initializing a node
    def __init__(self, data):
       self.data = data
       self.next = None


class Stack:
    # initializing a linkedlist
    def __init__(self):
        self.head = None

    def push(self, data):
        # if the head doesn't exist create a new node and assign it as head
        if self.head is None:
            self.head = Node(data)
        # else Create a new node and point it towards head and reassign the new node as head
        else:
            newnode = Node(data);
            newnode.next = self.head
            self.head = newnode

    def pop(self):
        # if head is empty then return nothing
        if self.head is None:
            return None
        # else re-assign head as its next node and disconnect with the previous head.
        else:
            popnode = self.head
            self.head = self.head.next
            popnode.next = None
            return popnode.data
        
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
