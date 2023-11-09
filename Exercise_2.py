
class Node:
    def __init__(self, data):
       self.data = data
       self.next = None


#  time Complexity :
#   push - o(1) since we are adding at the head always
#   pop - o(1)
#  space Complexity:
#  do we need to consider the space of the list node? is so then size of stack O(size)
class Stack:
    def __init__(self):
        self.head = Node("dummyHead")
        self.count = 0
        self.maxSize = 1000
        
    def push(self, data):
        if self.count < self.maxSize:
            newNode = Node(data)
            if self.count != 0:
                newNode.next = self.head.next
            self.head.next = newNode
            self.count += 1

    def pop(self):
        if self.count > 0:
            popped = self.head.next.data
            self.head.next = self.head.next.next
            self.count -= 1
            return popped
        return

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
