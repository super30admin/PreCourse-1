'''
Stack

'''


class myStack:
    def __init__(self):
        '''
        Constructor
        '''
        self.items = []

    def isEmpty(self):
        '''
        checks if the stack is empty
        :return: boolean value
        '''
        if self.items == []:
            print("Stack is Empty!")
        else:
            print("Stack is NOT Empty!")

    def push(self, item):
        '''

        :param item: push the elements at the last index
        :return: None
        '''
        self.items.append(item)


    def pop(self):
        '''
        the elements removed from Stack
        :return: None
        '''
        self.items.pop()


    def peek(self):
        '''
        Allows us to see the last element in the stack
        :return: Last item
        '''
        if self.items:
            return self.items[-1]
        else:
            return None

    def size(self):
        '''
        checks the size of the stack
        :return: length of the stack(list)
        '''
        return len(self.items)


    def show(self):
        print(self.items)


s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
print(s.size())
s.isEmpty()
print(s.peek())
print(s.show())
s.push('5')
s.push('6')
print(s.show())
print(s.peek())
