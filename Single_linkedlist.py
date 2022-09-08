
class ListNode:

    def __init__(self, data, node=None):
        self.data = data
        self.next_node = node

    def get_next(self):
        return self.next_node

    def set_next(self, node):
        self.next_node = node

    def get_data(self):
        return self.data

    def set_data(self, data):
        self.data = data


class SinglyLinkedList:

    def __init__(self, head=None):
        self.head = head
        self.size = 0

    def append(self, data):
        new_node = ListNode(data, self.head)
        self.head = new_node
        self.size += 1



    def find(self, data):
        this_node = self.head
        while this_node:
            if this_node.get_data() == data:
                return data
            else:
                this_node = this_node.get_next()
        return None

    def remove(self, data):
        this_node = self.head
        prev_node = None

        while this_node:
            if this_node.get_data() == data:
                if prev_node:
                    prev_node.set_next(this_node.get_next())
                else:
                    self.head = this_node.get_next()
                self.size -= 1
                return True  # data removed
            else:
                prev_node = this_node
                this_node = this_node.get_next()
        return False  # data not found

def main():
    myList = SinglyLinkedList()
    myList.append(15)
    myList.append(112)
    print(myList.remove(112))

    print(myList.find(15))

main()