
class Node:
    def __init__(self, data):
       self.data = data
       self.next = None
 
class Stack:
    def __init__(self):
        self.count = 0
        self.head = None
        self.tail = None
#Time complexity 0(1)
#Space complexity 0(n)
    def push(self, data):
        newNode = Node(data)
        if self.head == None:
            self.head = newNode
            self.tail = newNode
        else:
            self.tail.next = newNode
            self.tail = newNode
        self.count +=1
        return self.head

#Time complexity 0(1)
#Space complexity 0(n)      
    def pop(self):
        if self.count == 0:
            return
        else:
            prev = None
            curr = self.head
            while curr.next:
                prev = curr
                curr = curr.next
            if prev == None:
                data = self.head.data
                self.head = None
                return data
            data = curr.data
            prev.next = None
            self.count -=1
            return data

    def is_Empty(self):
        return self.count == 0

    def peek(self):
        if not self.is_Empty():
            return self.tail.data
        else:
            return

        
a_stack = Stack()
""" a_stack.push(1)
a_stack.push(2)
a_stack.push(4)
a_stack.push(6)
a_stack.pop() """

while True:
    #Give input as string if getting an EOF error. Give input like "push 10" or "pop"
    print('push <value>')
    print('pop')
    print('quit')
    print('empty')
    print('peek')
    print('Next Cycle')
    do = input('What would you like to do? ').split()
    #Give input as string if getting an EOF error. Give input like "push 10" or "pop"
    operation = do[0].strip().lower()
    if operation == 'push':
        a_stack.push(int(do[1]))
    elif operation == 'empty':
        if a_stack.is_Empty():
            print("Stack is Empty")
        else:
            print("Stack is not empty")
    elif operation == 'peek':
        if a_stack.is_Empty():
            print("Stack is Empty")
        else:
            print(a_stack.peek())
    elif operation == 'pop':
        popped = a_stack.pop()
        if popped is None:
            print('Stack is empty.')
        else:
            print('Popped value: ', int(popped))
    elif operation == 'quit':
        break
