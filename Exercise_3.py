class Node:
    def __init__(self, data):
        self.data = data
        self.next = None

    def __str(self):
        return self.data


class LinkedList:

    def __init__(self):
        """
           Time complexity: Constant O(1)
           Space complexity: Constant O(1)
        """
        self.size = 0
        self.head = None

    def insert(self, data):
        """
            Time complexity: Constant O(1)
            Space complexity: Constant O(1)
        """
        node = Node(data)
        if self.head:
            node.next = self.head
        self.head = node
        self.size += 1

    def printList(self):
        """
            Time complexity: Linear O(n)
            Space complexity: Constant O(1)
        """
        cur = self.head
        result = ''
        while cur:
            result += f'{cur.data} '
            cur = cur.next
        print(result) if result else print('Empty List!')

    def delete(self, data):
        """
            Time complexity: Linear O(n)
            Space complexity: Constant O(1)
        """
        if self.head:
            if data == self.head.data:
                self.head = self.head.next
                self.size -= 1
            else:
                cur = self.head
                prev = None
                while cur:
                    if cur.data == data:
                        prev.next = cur.next
                        del cur
                        self.size -= 1
                        return
                    prev = cur
                    cur = cur.next


root = LinkedList()
root.printList()
root.insert(10)
root.insert(20)
root.insert(30)
root.printList()
root.delete(20)
root.printList()
root.delete(10)
root.printList()
root.delete(30)
root.printList()
root.insert(40)
root.insert(50)
root.printList()
root.delete(50)
root.printList()
root.delete(40)
root.printList()
root.delete(4000)
root.printList()
