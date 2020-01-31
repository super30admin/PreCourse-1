class Node:
    def __init__(self,val):
        self.val = val
        self.next = None

class Stack:
    def __init__(self,head=None):
        self.head = head

    def push(self,val):
        if self.head==None:
            self.head = Node(val)
        else:
            newNode = Node(val)
            newNode.next = self.head
            self.head=newNode

    def pop(self):
        if self.head==None:
            print("No more elements to pop")
            return None
        else:
            node = self.head
            self.head = self.head.next
            return node

    def print_p(self):
        print("All the elements of stack:")
        temp = self.head
        while temp:
            print(temp.val)
            temp = temp.next


if __name__=="__main__":
    stack = Stack()
    stack.push(2)
    stack.push(3)
    stack.push(4)
    stack.push(5)
    stack.print_p()
    topElement = stack.pop()
    print("Popped Element",topElement.val if topElement else "None")
    topElement = stack.pop()
    print("Popped Element",topElement.val if topElement else "None")
    stack.push(18)
    stack.print_p()