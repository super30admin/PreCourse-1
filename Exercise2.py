class Node:
    def __init__(self, data):
        self.data = data
        self.next = None
        pass

class Stack:
    def __init__(self):
        self.head = None
        pass

    def push(self,data):
        if not self.head:
            self.head = Node(data)
        else:
            add_node = Node(data)
#             self.head.next = add_node
#             self.head = add_node
            add_node.next = self.head
            self.head = add_node
        print("pushed",data)
        pass

    def pop(self):
        if not self.head:
            return None
        else:
            last_node = self.head
            self.head = last_node.next
            print("Popped",last_node.data)
        pass

    def show(self):
        a = []
        x = self.head
        while x is not None:
            a.append(x.data)
            x = x.next
        print("Stack:",a)
        pass

s = Stack()

s.push(1)
s.push(2)
s.push(3)

s.show()

s.pop()
s.show()
