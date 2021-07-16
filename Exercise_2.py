class Node:
    def __init__(self, data = None):
       self.data = data
       self.next = None
 
class Stack:
    def __init__(self):
        self.head = Node()
        self.cur = self.head
   
     '''
     push()
     Time complexity:  O(1)
     Space complexity: O(1)
     '''
    def push(self, data):
        top = Node(data)
        top.next = self.cur
        self.cur = top

     '''
     pop()
     Time complexity:  O(1)
     Space complexity: O(1)
     '''
    def pop(self):
        # Stack Underflow condition
        if self.cur == self.head:
            return
        item = self.cur.data
        self.cur = self.cur.next
        return item

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
    else:
        print('Please select a valid operation')
