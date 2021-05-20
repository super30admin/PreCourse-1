class myStack:
    list_items = []

    # Initialize the list
    def __init__(self):
        self.list_items = []

    # Checking for the stack is empty
    # By checking the length of list is equal to zero or not
    def isEmpty(self):
        if len(self.list_items) == 0:
            return True
        else:
            return False

    # Time complexity o(1) for push operation
    # Adding elements in push operation

    def push(self, item):
        self.list_items.append(item)
        print('Element is pushed on to stack', item)

    # Time complexity o(1) for pop operation
    def pop(self):
        if len(self.list_items) == 0:
            print('List is empty, pop operation cannot be performed')
        else:
            # removing elements from list
            self.list_items.pop()
            print('Last element is removed from list')

    # Time complexity o(1) for peek  operation
    def peek(self):
        if len(self.list_items) == 0:
            print('It is an empty stack')
            return None
        else:
            # peek of stack is the last element of list
            print(self.list_items[len(self.list_items) - 1])
            return self.list_items[len(self.list_items) - 1]

    def size(self):
        # Time complexity is o(1)
        # size is determined by the length of list
        return len(self.list_items)

    def show(self):
        # Iterating through the list of items to display the stack content
        # Time complexity is o(n)
        for i in self.list_items:
            print(i)


s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
