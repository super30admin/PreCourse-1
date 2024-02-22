# time Complexity = O(n), Space compexity = O(1)


class Node:
    def __init__(self, data):
        self.data = data
        self.next = None


class Stack:
    def __init__(self):
        self.head = Node(0)  # initialize stack with dummy node with data =0

    def push(self, data):
        new_node = Node(data)  # new node created with input data
        temp = self.head
        while temp.next:  # traverse till last element of the stack
            temp = temp.next
        temp.next = new_node  # add new_node to stack
        print(temp.next.data, "has been pushed to stack")

    def pop(self):
        temp = self.head
        if (
            self.head == None
        ):  # if head of the linkedlist is null that is if stack if empty return None
            return None
        if (
            self.head.next == None
        ):  # if stack has only one element then return head and remove head from stack
            self.head = None
            return self.head
        else:
            while (
                temp.next.next
            ):  # if stack has more than one element then traverse till second last element in the linkedlist and remove the last element from the LinkdList
                temp = temp.next
            popped_elemt = temp.next
            temp.next = None
            return popped_elemt.data  # return popped element


a_stack = Stack()
while True:
    # Give input as string if getting an EOF error. Give input like "push 10" or "pop"
    print("push <value>")
    print("pop")
    print("quit")
    do = input("What would you like to do? ").split()
    # Give input as string if getting an EOF error. Give input like "push 10" or "pop"
    operation = do[0].strip().lower()
    if operation == "push":
        a_stack.push(int(do[1]))
    elif operation == "pop":
        popped = a_stack.pop()
        if popped is None:
            print("Stack is empty.")
        else:
            print("Popped value: ", int(popped))
    elif operation == "quit":
        break
