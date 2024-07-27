# Approach: Stack is Last In First Out 
# for push we are pushing at front means changing the head everytime that's why node.next is pointing to head of list 
# for popping we want to pop first element so changing the self.head to it's neighbour and return popped_data
"""Summary :
the push and pop operations are both constant-time operations (𝑂(1),O(1))

"""
class Node:
    def __init__(self, data):
       self.data = data
       self.next = None
 
class Stack:
    def __init__(self):
        self.head=None
        
    def push(self, data):
        node=Node(data)
        node.next = self.head  # Point the new node to the current top
        self.head = node
        print(f"Pushed {data} onto the stack.")
        self.print_stack() 
        # if self.head==None:
        #     self.head=node
        # else:
        #     cur=self.head
        #     while cur.next:
        #         cur=cur.next
        #     cur.next=node
        
        
    def pop(self):
        if self.head is None:
            print("Stack is empty, cannot pop")
        popped_data = self.head.data
        self.head = self.head.next
        return popped_data
    
    def print_stack(self):
        cur = self.head
        while cur:
            print(cur.data, end=" -> ")
            cur = cur.next
        print("None")
        
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


"""Output 
push <value>
pop
quit
What would you like to do? push 2
Pushed 2 onto the stack.
2 -> None
push <value>
pop
quit
What would you like to do? push 3
Pushed 3 onto the stack.
3 -> 2 -> None
push <value>
pop
quit
What would you like to do? push 9
Pushed 9 onto the stack.
9 -> 3 -> 2 -> None
push <value>
pop
quit
What would you like to do? pop
Popped value:  9
push <value>
pop
quit
What would you like to do? pop
Popped value:  3
push <value>
pop
quit
What would you like to do? pop
Popped value:  2
push <value>
pop
quit
What would you like to do? pop
Stack is empty, cannot pop
ERROR!
Traceback (most recent call last):
  File "<main.py>", line 55, in <module>
  File "<main.py>", line 32, in pop
AttributeError: 'NoneType' object has no attribute 'data'

=== Code Exited With Errors ==="""