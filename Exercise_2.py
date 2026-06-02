# Time and Space Complexity
# Overall Space Complexity is O(N) where N is the number of elements in stack
# __init__ function has time and space complexity of O(1)
# push function has time and space complexity of O(1)
# pop function has time and space complexity of O(1)
class Node:
    def __init__(self, data):
       self.data = data
       self.next = None
 
class Stack:
    def __init__(self):
        self.top=None
        
    def push(self, data):
        newNode=Node(data)
        newNode.next=self.top
        self.top=newNode
        
    def pop(self):
        if self.top==None:
            return None
        else:
            value=self.top.data
            self.top=self.top.next
            return value
        
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
