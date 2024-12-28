
# Time complexity : push -> O(1), pop -> O(1)
# Space complexity: O(n)

# Add the elements to the head of the linked list and keep updating the head
# When performing a pop operation remove the element at head and update the head.


class Node:
    def __init__(self, data):
       self.data = data
       self.next = None
 
class Stack:
    def __init__(self):
        self.head = None
         
    def push(self, data):        
        new_node = Node(data)
        new_node.next = self.head
        self.head = new_node
        
    def pop(self):
        if not self.head:
            print("Error")
            return None
        temp = self.head
        self.head = self.head.next
        temp.next = None
        return temp.data
        
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
