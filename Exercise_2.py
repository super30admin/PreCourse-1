# Time Complexity : O(1) for push, peek, size operations
# Time Complexity : O(n) for pop 
# Space Complexity : O(n) where n is the number of elements in the stack


class Node:
    def __init__(self, data):
       self.data = data
       self.next = None
 
class Stack:
    def __init__(self):
        self.head = Node(None)
        self.last = Node(None)
        self.last.next = self.head
        self.size = 0

    def isEmpty(self):
        return self.currSize() == 0

    def push(self, data):
        newNode = Node(data)
        self.last.next.next = newNode
        self.last.next = newNode
        self.size+=1

    def currSize(self):
        return self.size

    def pop(self):
        if self.size == 0:
            return None
        lastNode = self.last.next
        tmpNode = Node(None)
        tmpNode.next = self.head
        while tmpNode.next.next != None and  tmpNode.next.next != lastNode:
            tmpNode.next = tmpNode.next.next
        self.last.next = tmpNode.next
        self.last.next.next = None
        self.size-=1
        return lastNode.data

    def peek(self):
        if self.isEmpty():
            return None
        return self.last.next.data

        
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
    elif operation == 'currsize':
        print(a_stack.currSize())
    elif operation == 'quit':
        break
