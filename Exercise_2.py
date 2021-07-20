
class Node:
    def __init__(self, data):
        self.data = data
        self.next = None


class Stack:
    def __init__(self):
        self.root=None;

    def push(self, data):
        newNode=Node(data)
        if self.root == None:
            self.root=newNode;
        else:
            temp=self.root
            while temp.next!=None:
                temp=temp.next
            temp.next=newNode;

    def pop(self):
        if self.root==None:
            print('Stack Underflow')
            return 0;
        if self.root.next==None:
            tempValue=self.root.data
            self.root=None
            return tempValue
        temp=self.root;
        prev=None
        while temp.next!=None:
            prev=temp
            temp=temp.next
        value=prev.next.data
        prev.next=None
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
