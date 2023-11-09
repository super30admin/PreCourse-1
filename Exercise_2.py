
"""
Time Complexity:
Push - O(n)
Pop - O(n)
Show - O(n)

Space Complexity
O(n)

"""
class Node:
    def __init__(self, data):
       self.data = data
       self.next = None
 
class Stack:
    def __init__(self):
        self.stack = None

    def push(self, data):
        if self.stack is None:
            self.stack = Node(data)
            print("Added a first value of",data)
        else:
            temp = self.stack
            while temp.next != None:
                temp = temp.next
            temp.next = Node(data)
            print("Pushed a value", data)
    def pop(self):
        if self.stack is None:
            return None
        elif self.stack.next is None:
            self.stack  = None
            print("The stack is emptied")
        else:
            temp = self.stack
            while temp.next is not None:
                parent = temp
                temp = temp.next
            parent.next = None
            return temp.data
    def show(self):
        if self.stack is None:
            print(" The stack is very eampty ")
            return
        temp = self.stack
        while temp.next is not None:
            print(temp.data)
            temp = temp.next
        print(temp.data)

a_stack = Stack()
while True:
    #Give input as string if getting an EOF error. Give input like "push 10" or "pop"
    print('push <value>')
    print('pop')
    print('show')
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
    elif operation == 'show':
        a_stack.show()
    elif operation == 'quit':
        break
