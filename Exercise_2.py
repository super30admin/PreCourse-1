# Time Complexity O(1)
# - overall time complexity of the while loop: O(n), where n is the number of operations performed

# Space Complexity:
# - The space complexity of the stack depends on the number of elements stored in it.

class Node:
    def __init__(self, data):
       self.data = data
       self.next = None
 
class Stack:
     def __init__(self):
        self.items = []
        
     def push(self, item):
        self.items.append(item)
        
     def pop(self):
        return self.items.pop()
        
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
