# Time Complexity : O(1) with show() it will be O(n)
# push: O(1)
# pop: O(1)
# show: O(n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : yes
# Any problem you faced while coding this : No

class Node:
    def __init__(self, data):
       self.data = data
       self.next = None
 
class Stack:
    def __init__(self):
        self.head = None
        
    def push(self, data):
        newNode = Node(data)
        current = self.head
        self.head = newNode
        self.head.next = current
        
    def pop(self):
        if self.head is None:
            return None    
        
        tmp = self.head.data
        self.head = self.head.next
        return tmp
        
    def show(self):
        current = self.head
        if current is None:
            print("Stack is empty")
            return
        print("\n--- Stack (top to bottom) ---")
        while current is not None:
            addr = id(current)
            next_addr = id(current.next) if current.next else None
            print(f"Data: {current.data} | Address: {addr} | Next: {next_addr}")
            current = current.next
        print("-----------------------------\n")

        
a_stack = Stack()
while True:
    #Give input as string if getting an EOF error. Give input like "push 10" or "pop"
    print('push <value>')
    print('pop')
    print('quit')
    print('show')
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
    elif operation == 'show':
        a_stack.show()
    elif operation == 'quit':
        break
