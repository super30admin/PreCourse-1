  # O(1) time complexity 
  # O(1) space comlexity
class Node:
    def __init__(self, data):
       self.data = data
       self.next = None
 
class Stack:
    def __init__(self):
        self.top=None
        
    def push(self, data):
        new_node=Node(data)
        new_node.next=self.top
        self.top=new_node
        
    def pop(self):
        if self.top is None:
            return None
        pop_node=self.top
        self.top= self.top.next
        return pop_node.data
        
a_stack = Stack()
while True:
    print('push <value>')
    print('pop')
    print('quit')
    try:
        do = input('What would you like to do? ').split()
        operation = do[0].strip().lower()
        if operation == 'push':
            a_stack.push(int(do[1]))
        elif operation == 'pop':
            popped = a_stack.pop()
            if popped is None:
                print('Stack is empty.')
            else:
                print('Popped value: ', popped)
        elif operation == 'quit':
            break
        else:
            print('Invalid operation.')
    except EOFError:
        print("Received an EOF error, please provide input as a string.")
    except Exception as e:
        print("An error occurred:", e)