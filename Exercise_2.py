
class Node:
    def __init__(self, data):
       self.data = data
       self.next = None
 
class Stack:
    def __init__(self):

        self.head = None
        self.last = None
        self.last_before = None
        self.count = 0

    def push(self, data):

        self.count = self.count + 1

        if(self.head == None):

            self.head = Node(data)
            print(self.head)

        else:

            if(self.head.next == None):

                temp = Node(data)

                self.last = temp

                self.head.next = self.last

                print('Last address: ',self.last)
                print('Head next address: ',self.head.next)

            else:

                temp = Node(data)

                self.last.next = temp

                self.last = temp
        
    def pop(self):

        print('Head info: ',format(self.head))

        if(self.head == None):

            print('Exe..')

            return None

        elif(self.head.next == None):

            return_element = self.head.data

            self.head = None

            print('Exe..')

            return return_element

        temp_address = self.head.next

        temp_count = self.count

        print('----------------')

        for i in range(self.count):

            print(i)

            if(i == self.count-2):

                temp_next_address = temp_address.next

                temp_address.next = None

                return temp_next_address

            elif(temp_address.next != 0):

                temp_count = temp_count - 1

                print('Data: ',temp_address.data)

                temp_address = temp_address.next

        print('This should not return')


    def traverse(self):

        i = self.head

        print(i.data)
        print(i.next)

        while(i != None):

            print('Data: ', i.data)

            i = i.next
        
a_stack = Stack()
while True:
    #Give input as string if getting an EOF error. Give input like "push 10" or "pop"
    print('push <value>')
    print('pop')
    print('quit')
    print('traverse')
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
    elif operation == 'traverse':
        print('Exe..')
        a_stack.traverse()
