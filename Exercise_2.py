#Time Complexity: Push - O(1), Pop - O(1), Peek - O(1)
#Space Complexity: Push - O(1), Pop - O(1), Peek - O(1)

class Node:
    def __init__(self, data):
       self.data = data
       self.next = None
 
class Stack:
    def __init__(self):
        self.top = None #root of the LL -> top of the stack
        
    def push(self, data):
        newNode = Node(data)
        newNode.next = self.top
        self.top = newNode

        
    def pop(self):
        poppedNode = self.top
        self.top = self.top.next if self.top else None
        return poppedNode.data if poppedNode else None

    def peek(self):
        return self.top.data if self.top else None
        
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
