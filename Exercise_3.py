class Node:
    def __init__(self, data):
        self.data = data
        self.next = None


class LinkedList:
    def __init__(self):
        self.root = None

    def insert(self, data):
        if not self.root:
            self.root = Node(data)
        else:
            cur = self.root
            while cur.next:
                cur = cur.next
            cur.next = Node(data)
        self.printList()

    def printList(self):
        cur = self.root
        while cur and cur.next:
            print(cur.data, "->", end=" ")
            cur = cur.next
        if cur:
            print(cur.data)
        else:
            print("Empty LinkedList!")

    def delete(self, data):
        cur = self.root
        prev = None
        while cur and cur.data != data:
            prev = cur
            cur = cur.next
        if prev:
            prev.next = cur.next
        elif cur and cur.data == data:
            # Root node
            self.root = self.root.next
        else:
            print("Not found")
            return
        self.printList()


root = LinkedList()

root.insert(10)
root.insert(20)
root.insert(30)
root.delete(20)
root.delete(10)
root.delete(30)
root.insert(40)
root.insert(50)
root.delete(50)
root.delete(40)
root.delete(4000)
