
class Node:
    def __init__(self, data):
       self.data = data
       self.next = None
 
class Stack:
    def __init__(self):
        self.head = None

    """
    Removes the last added element
    Time Complexity O(n) 
    """
    def push(self, data):
        if not self.head:
            self.head = Node(data)
        else:
            curr = self.head
            while curr.next:
                curr = curr.next
            curr.next = Node(data)

    """
        Prints all the elements
        Time Complexity O(n)
        """
    def printStack(self):
        head = self.head
        res = []
        while head:
            res.append(head.data)
            head = head.next
        print(res)

    """
        Removes the last added element
        Time Complexity O(n) 
    """
    def pop(self):
        if not self.head: return None
        curr = self.head
        prev = None
        while curr.next:
            prev = curr
            curr = curr.next
        prev.next = curr.next
        return curr.data
        
a_stack = Stack()
while True:
    #Give input as string if getting an EOF error. Give input like "push 10" or "pop"
    print('push <value>')
    print('pop')
    print('quit')
    print("print")
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
    elif operation == 'print':
        a_stack.printStack()
    elif operation == 'quit':
        break
