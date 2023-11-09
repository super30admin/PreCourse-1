# Time Complexity :
    # Both Push and Pop operations have O(1) time complexity.
# Space Complexity :
    # O(n), where n is the number of elements in the stack.

class Node:
    def __init__(self, data):
       self.data = data
       self.next = None
       
 
class Stack:
    def __init__(self):
        self.head=Node(None)
        self.count=0
        self.show_count=0
    def push(self, data):
        new_node=Node(data)
        if self.head is None:
            self.head=new_node
        else:
            new_node.next=self.head
            self.head=new_node
        self.count+=1

    def pop(self):
        if not self.head: 
            return None
        else:
            val=self.head.data
            self.head=self.head.next
            self.count-=1
            return val

    
    def show(self):
        self.show_count=self.count
        val=self.head
        while self.show_count>0:
            print(val.data)
            val=val.next
            self.show_count-=1

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
        a_stack.show()
    elif operation == 'pop':
        popped_val = a_stack.pop()
        if popped_val is None:
            print('Stack is empty.')
        else:
            print('Popped value: ', int(popped_val))
            print('Current Stack:')
            a_stack.show()
    elif operation == 'quit':
        break
