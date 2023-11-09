class Node:
    def __init__(self, data):
        self.data = data
        self.next = None
 
class Stack:
    def __init__(self):
        self.root = None
        
    def push(self, data):
        new = Node(data)
        new.next = self.root
        self.root = new
        return data
        
    def pop(self):
        temp = self.root
        self.root = self.root.next
        pop = temp.data
        return pop
        
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

#Time Complexity
# is Empty()  --> O(1)
# pop()  --> O(1)
# push()  --> O(1)
# peek()  --> O(1)
# size()  --> O(1)
# show()  --> O(1)