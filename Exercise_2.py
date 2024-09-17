# push O(1)
# pop(1)

class Node:
    def __init__(self, data, next=None):
       self.data = data
       self.next = next
 
class Stack:
    def __init__(self):
        self.head = None
        
    def push(self, data):
        self.head = Node(data, self.head)
        
    def pop(self):
        curr = self.head
        self.head = self.head.next
        return curr.data
        
if __name__ == "__main__":
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
