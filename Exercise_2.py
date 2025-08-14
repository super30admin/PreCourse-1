'''
Time Complexity:
  1) push(), peek() : O(1)
  2) pop(): O(N), N = size of stack
Space Complexity:
  1) O(N)
'''

class Node:
    def __init__(self, data):
       self.data = data
       self.next = None
 
class Stack:
    def __init__(self):
        self.root = Node(-1)
        self.curr = self.root
        self.size = 0
        
    def push(self, data):
        # make a new node
        new_node = Node(data)
        # Link to curr list
        self.curr.next = new_node
        # update the current
        self.curr = new_node
        self.size+=1
        
    def pop(self):
        if self.size == 0:
            print("Stack underflow")
            return 0
        # extract last item
        last = self.curr.data
        # loop over list to reach second last element
        head = self.root
        for i in range(self.size-1):
            head=head.next
        
        # remove the link
        head.next = None 
        
        # delete the last node
        del self.curr
        self.size-=1

        # update the current
        self.curr = head

        return last
    
    def peek(self):
        if self.size==0:
            return None
        return self.curr.data
    
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
