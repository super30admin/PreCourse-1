# 1):- For push Method:
#Time Complexity: O(1)
#Space complexity: O(1)
########################
# 2):- For pop Method:
#Time Complexity: O(1)
#Space complexity: O(1)
class Node:
    def __init__(self, data):
       self.data = data
       self.next = None
 
class Stack:
    def __init__(self):
        self.top = None
        
    def push(self, data):
        newnode = Node(data)
        newnode.next = self.top
        self.top = newnode
        
    def pop(self):
        if self.top is not None:
            poppeditem = self.top.data
            self.top = self.top.next
            return poppeditem
        else:
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
        print('Pushed value: ', int(do[1]))
    elif operation == 'pop':
        popped = a_stack.pop()
        if popped is None:
            print('Stack is empty.')
        else:
            print('Popped value: ', int(popped))
    elif operation == 'quit':
        break
