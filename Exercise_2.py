#Time Complexity is O(n) 
#Space Complexity is O(1) constant space
class Node:
    def __init__(self, data):
       self.data = data
       self.next = None
 
class Stack:
    def __init__(self):
        self.data = None
        pass
        
    def push(self, data):
        if self.data == None:
            self.data=Node(data)
            return data

        temp = self.data

        while temp !=None:
            if temp.next == None:
                temp.next = Node(data)
                return data
            temp = temp.next
        
    def pop(self):
        if self.data == None:
            return None
        if self.data.next == None:
            d = self.data.data
            self.data = None
            return d

        pop_node = self.data
        while pop_node.next.next != None:
            pop_node = pop_node.next
        d= pop_node.next.data
        pop_node.next = None
        return d
        
        
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
