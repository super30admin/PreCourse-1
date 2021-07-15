
class Node:
    def __init__(self, data):
       self.data = data
       self.next = None
 
class Stack:
    def __init__(self):
        self.head = None
        self.cur_ptr=None
        
    def push(self, data):
        temp = Node(data)
        if self.head:
            self.cur_ptr.next = temp
            self.cur_ptr = temp
        else:
            self.head = temp
            self.cur_ptr = temp
        
    def pop(self):
        if self.head:
            element = self.cur_ptr.data
            if self.head == self.cur_ptr:
                self.head = None
                self.cur_ptr = None
            else:
                temp = self.head
                while temp.next != self.cur_ptr:
                    temp = temp.next
                del(self.cur_ptr)
                self.cur_ptr = temp
            return element
        return None
                
        
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
