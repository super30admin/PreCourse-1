
class Node:
    def __init__(self, data):
       self.data = data
       self.next = None
 
class Stack:
    def __init__(self):
        self.top = Node(0)
        
    def push(self, data):
        temp = Node(data)
        top_temp = self.top
        temp.next = self.top
        self.top = temp

        
    def pop(self):
        top = self.top
        self.top = top.next
        return top.data
    
    def print_stack(self):
        runner = self.top
        while(runner):
            print(runner.data)
            runner = runner.next

a_stack = Stack()
while True:
    # #Give input as string if getting an EOF error. Give input like "push 10" or "pop"
    # print('push <value>')
    # print('pop')
    # print('quit')
    do = input('What would you like to do? ').split()
    #Give input as string if getting an EOF error. Give input like "push 10" or "pop"
    operation = do[0].strip().lower()
    print(f"this is the operation {operation}.")
    
    if operation == 'push':
        print(f"this is the value {do[1]}.")
        a_stack.push(int(do[1]))
    elif operation == 'pop':
        print("Operation is Pop")
        popped = a_stack.pop()
        if popped is None:
            print('Stack is empty.')
        else:
            print('Popped value: ', int(popped))
    elif operation == 'quit':
        break
