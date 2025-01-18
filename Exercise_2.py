class Node:
    def __init__(self, data, next=None):
        self.data = data
        self.next = None


class Stack:
    def __init__(self):
        self.top = None

    def push(self, val):
        node = Node(val)
        # Insert node at the start of the linked list
        node.next = self.top
        self.top = node

    def pop(self):
        if self.top is None:
            print("Stack is empty")
            return None
        top_element = self.top
        self.top = top_element.next
        return top_element.data

    def size(self):
        stack_size = 0
        current_node = self.top
        while current_node:
            stack_size += 1
            current_node = current_node.next
        return stack_size
    
    def print_stack(self):
        current_node = self.top
        while current_node:
            print('||',current_node.data,'||')
            current_node = current_node.next
        print('-------------')

    def get_top(self):
        if self.top is None:
            return None
        return self.top.data
    
    def is_empty(self):
        return self.top is None



a_stack = Stack()
a_stack.push(1)
a_stack.push(2)
a_stack.push(3)
a_stack.push(4)
a_stack.print_stack()
print('Size - ', a_stack.size())
print("pooped element - ", a_stack.pop())
a_stack.print_stack()
a_stack.get_top()
print('is stack empty? ', a_stack.is_empty())
print('Size - ', a_stack.size())

# while True:
#     #Give input as string if getting an EOF error. Give input like "push 10" or "pop"
#     print('push <value>')
#     print('pop')
#     print('quit')
#     do = input('What would you like to do? ').split()
#     #Give input as string if getting an EOF error. Give input like "push 10" or "pop"
#     operation = do[0].strip().lower()
#     if operation == 'push':
#         a_stack.push(int(do[1]))
#     elif operation == 'pop':
#         popped = a_stack.pop()
#         if popped is None:
#             print('Stack is empty.')
#         else:
#             print('Popped value: ', int(popped))
#     elif operation == 'quit':
#         break
