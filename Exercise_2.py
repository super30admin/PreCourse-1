#time Comlexity: O(n)
#space complexity: O(n)
class Node:
    def __init__(self, data):
       self.data = data
       self.next = None
 
class Stack:
    def __init__(self):
        self.top=Node(None)   
    def push(self, data):
        self.new_node=Node(data)
        if self.top.next==None:
            self.top.next=self.new_node
        else:
            self.new_node.next=self.top.next
            self.top.next=self.new_node
    def pop(self):
        if self.top.next==None:
            return None
        curr=self.top.next.data
        self.top.next=self.top.next.next
        return curr
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
