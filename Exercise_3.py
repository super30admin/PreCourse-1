class Node:
    def __init__(self, data):
       self.data = data
       self.next = None

class LinkedList:
    def __init__(self):
        self.head = None

    def insert(self,data):
        if self.head is None:
            self.head  = Node(data)
        else:
            new_node = Node(data)
            new_node.next = self.head
            self.head = new_node

    def search(self,data):
        current_node = self.head
        while current_node:
            if current_node.data == data:
                return True
            else:
                current_node = current_node.next
        return False

    def delete(self,data):
        current_node = self.head
        previous_node = None
        while current_node:
            if current_node.data == data and self.head == current_node:
                popped_element = self.head.data
                self.head = self.head.next
                return popped_element
            elif current_node.data == data:
                popped_element = current_node.data
                previous_node.next = current_node.next
                return popped_element
            else:
                previous_node = current_node
                current_node = current_node.next
        return None

    def size(self):
        current_node = self.head
        length = 0
        while current_node:
            length = length+1
            current_node = current_node.next
        return length


ll = LinkedList()
ll.insert(30)
ll.insert(20)
ll.insert(10)
ll.insert(50)
print(ll.size())
ll.delete(30)
print(ll.size())
