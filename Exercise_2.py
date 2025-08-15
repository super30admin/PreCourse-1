# TC:
#  - Push: O(1)
#  - Pop: O(1)
# SC:
#  - O(N) where N is the length of linked list after adding N elements linked with each other
class Node:
    def __init__(self, data):
       self.data = data
       self.next = None
 
class Stack:
    def __init__(self):
        self.curr_node = None
        
    def push(self, data):
        new_node = Node(data)
        new_node.next = self.curr_node
        self.curr_node = new_node
        
    def pop(self):
        temp_node = self.curr_node
        if temp_node:
            self.curr_node = self.curr_node.next
            return temp_node.data
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
