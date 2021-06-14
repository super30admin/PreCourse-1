# implement stack using linked list

# Time complexity: O(1)
# Space complexity: O(n)
# Any problem you faced while coding this : pop operation

class Node:
    def __init__(self, data):
       self.data = data
       self.next = None
 
class Stack:

    def __init__(self):
        self.head = None

    def isEmpty(self):
        if self.head == None:
            return True
        else:
            return False

    def push(self, data):
        if self.head == None:
            self.head = data
        else:
            newNode = Node(data)
            newNode.next = self.head
            self.head = newNode

    def pop(self):
        if self.isEmpty():
            return None
        else:
            poppedNode = self.head
            self.head = self.head.next
            poppedNode.next = None
            return poppedNode.data

a_stack = Stack()

while True:
    print('push <value>')
    print('pop')
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
    elif operation == 'quit':
        break
