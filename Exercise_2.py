
#space complexity: O(n)
#time complexity: O(1) for both push and pop
#difficulty faced: deciding which element is tos while pushing, returning root in pop
class Node:
    def __init__(self, data):
       self.data = data
       self.next = None
 
class Stack:
    def __init__(self):
        self.root = None
        
    def push(self, data):
        #root is tos so that both push and pop can be O(1)
        newnode = Node(data)
        newnode.next = self.root
        self.root = newnode

    def isEmpty(self):
        if self.root == None:
            return True
        else:
            return False
        
    def pop(self):
        if(self.isEmpty()):
            return -1
        temp = self.root
        self.root = self.root.next
        return temp.data
        
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