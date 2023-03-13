"""
Rasika Sasturkar
Time complexity: O(n), total no. of elements in the linkedlist.
Space complexity: O(n), total no. of elements in the linkedlist.
"""


class Node:
    def __init__(self, data):
        self.data = data
        self.next = None


class Stack:
    def __init__(self):
        self.head = None

    def push(self, data):
        if self.head is None:
            self.head = Node(data)
        else:
            curr = self.head
            while curr.next:
                curr = curr.next
            curr.next = Node(data)

    def pop(self):
        if self.head:
            curr = self.head
            if curr.next is None:
                self.head = None
                return curr.data
            prev = self.head
            while curr.next:
                prev = curr
                curr = curr.next
            prev.next = None
            return curr.data
        return


def main():
    a_stack = Stack()
    while True:
        # Give input as string if getting an EOF error. Give input like "push 10" or "pop"
        print('push <value>')
        print('pop')
        print('quit')
        do = input('What would you like to do? ').split()
        # Give input as string if getting an EOF error. Give input like "push 10" or "pop"
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


if __name__ == "__main__":
    main()
