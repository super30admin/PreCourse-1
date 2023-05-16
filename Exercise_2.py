# Time Complexity - push - O(n)
# pop - O(n)
# Stack creation - O(1)

# Space Complexity - O(n)
class Node:
    def __init__(self, data):
       self.data = data
       self.next = None
 
class Stack:
    def __init__(self):
        self.headval=None
    def push(self, data):
#         pointer to head/root node
        head=self.headval
        newnode=Node(data)
#         base case when the stack is empty so pushing the data as 1st element
        if head==None:
            self.headval=newnode
        else:
            while head.next:
                head=head.next
            head.next=newnode
        
    def pop(self):
        head=self.headval
#         base case if there is nothing to remove
        if head is None:
            return None
        else:
#             if there is just root node present, then popping the root and updating the head value
            if head.next is None:
                popped=head.data
                self.headval=None
                return popped
            else:
                cur=self.headval
                nxt=self.headval.next
                while nxt.next:
                    cur=cur.next
                    nxt=nxt.next
                popped=nxt.data
                cur.next=None
                return popped
            
        
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
