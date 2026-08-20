
class Node:
    def __init__(self, data):
       self.data = data
       self.next: "Node | None" = None
 
class Stack:
    def __init__(self):
        #Constructor here
        self.top = None

    def isEmpty(self):
        #Write your code here for the condition if stack is empty.
        if self.top is None:
            return True
        else:
            return False

    def push(self, data):
        #Write code to push data to the stack.
        new_node = Node(data)
        new_node.next = self.top
        self.top = new_node

    def pop(self):
        #If Stack Empty Return 0 and print "Stack Underflow"
        #Write code to pop the topmost element of stack.
        #Also return the popped element
        if self.isEmpty():
            print("Stack underflow")
            return None
        else:
            temp = self.top.data
            self.top = self.top.next
            return temp

    def peek(self):
        #Write code to just return the topmost element without removing it.
        if not self.isEmpty():
            return self.top.data
        else:
            print("Stack is empty")
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
    elif operation == 'pop':
        popped = a_stack.pop()
        if popped is None:
            print('Stack is empty.')
        else:
            print('Popped value: ', int(popped))
    elif operation == 'quit':
        break
