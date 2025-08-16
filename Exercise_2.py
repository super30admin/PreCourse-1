
#  Time Complexity : O(1) for push(), pop(). O(N) for show()
#  Space Complexity : O(N) where N is number of elements in stack.

# Intuition: keep the top at the new nodes being added. For pop, just move the top to next node.

class Node:
    def __init__(self, data):
       self.data = data
       self.next = None
 
class Stack:
    def __init__(self):
        self.top = None
        
    def push(self, data):
        new_node = Node(data)
        new_node.next = self.top
        self.top = new_node
        
    def pop(self):
        popped = self.top.data
        print(f'Popped element is: {popped}')
        self.top = self.top.next
        return popped
    def show(self):
        temp = self.top
        elements = []
        while temp is not None:
            elements.append(temp.data)
            temp = temp.next
        return elements        
        
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
    elif operation == 'show':
        elements = a_stack.show()
        print(f'Stack elements are:{elements} ')
    elif operation == 'quit':
        break
