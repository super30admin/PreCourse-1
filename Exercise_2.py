'''
Time Complexity
    - push: O(1)
    - pop: O(N)

Space Complexity: O(N)

'''
class Node:
    def __init__(self, data):
       self.data = data
       self.next = None
 
class Stack:
    def __init__(self):
        self.stack_ll = Node(data="header") 
        self.top = self.stack_ll
        
        
    def push(self, data):
        self.temp_stack = Node(data=data)
        self.top.next = self.temp_stack
        self.top = self.temp_stack
        

    def pop(self):
        if self.stack_ll.next:
            top_ele = self.top
            dummy_node = self.stack_ll
            while(dummy_node.next):
                if(dummy_node.next==top_ele):
                    self.top = dummy_node
                    self.top.next = top_ele.next
                    break
                dummy_node = dummy_node.next
            return top_ele.data
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
