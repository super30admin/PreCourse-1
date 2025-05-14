# Time complexity - For push, and pop the time complexity is O(1) as we are just adding after head and removing after head
# Space Complexity - O(1) Linked List will store just data and next pointer


class Node:
    def __init__(self, data):
        self.data = data
        self.next = None
class Stack:
    def __init__(self):
        self.head = Node(-1)
        self.head.next = None
        
    def push(self, data):
        new_node = Node(data)
        old_node = self.head.next
        self.head.next = new_node
        if old_node:
            new_node.next = old_node

    def pop(self):
        node = self.head.next
        self.head.next = node.next
        node.next = None
        if node:
            return node.data
        return None
    
    def show(self):
        result = []
        curr = self.head.next
        while curr:
            result.append(curr.data)
            curr = curr.next
        return result[::-1]
a_stack = Stack()
while True:
    #Give input as string if getting an EOF error. Give input like "push 10" or "pop"
    print('push <value>')
    print('pop')
    print('quit')
    print('show')
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
    elif operation == 'show':
        print(a_stack.show())
    elif operation == 'quit':
        break
