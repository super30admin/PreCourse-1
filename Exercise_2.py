
class Node:
    def __init__(self, data):
       self.previous = None
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

            # self.previous = None by default
            self.head = Node(data)
            return self.head.data

        else:

            if(self.head.next == None):

                temp = Node(data)

                self.last = temp
                self.last.previous = self.head
                self.head.next = self.last

                print('Previous address: ',self.last.previous)
                print('Last address: ',self.last)
                print('Head next address: ',self.head.next)

                return self.last.data

            else:

                temp = Node(data)
                temp_previous_address = self.last
                self.last.next = temp
                self.last = temp
                self.last.previous = temp_previous_address

                return self.last.data

        
    def pop(self):

        print('Head info: ',format(self.head))

        if(self.head == None):

            print('Exe..')

            return None

        elif(self.head.next == None):

            return_element = self.head.data

            self.head = None

            return return_element

        i = self.head.next

        while(i!= None):

            if(i.next == None):

                temp_removed_data = i.data
                i = i.previous
                i.next = None
                return temp_removed_data

            else:

                i = i.next


    def traverse(self):

        i = self.head

        print(i.data)
        print(i.next)

        while(i != None):

            print('Data: ', i.data)

            i = i.next

    def traverse_back(self):

        i = self.last

        print(i.data)
        print(i.next)
        
        while(i != None):

            print('Data: ', i.data)

            i = i.previous
        
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
        a_stack.traverse()
    elif operation == 'traverse_back':
        print('Exe..')
        a_stack.traverse_back()
