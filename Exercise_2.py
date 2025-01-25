# Time Complexity:
# Push, Pop, Peek, Is Empty, Get Size: O(1).
# Show: O(n).
# Space Complexity:
# O(n) for storing the n elements in the stack using linked list nodes.
class Node:
    def __init__(self, data):
       self.data = data
       self.next = None
 
class Stack:
    def __init__(self):
        self.top = None
        self.size = 0
        
    def push(self, data):
        new_node = Node(data)
        new_node.next = self.top
        self.top = new_node
        self.size += 1
        
    def pop(self):
        if self.isEmpty():
            raise IndexError("Pop from an empty stack.")
        popped_value = self.top.data
        self.top = self.top.next
        self.size -= 1
        return popped_value
    
    def isEmpty(self):
        return (self.size == 0)
        
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
