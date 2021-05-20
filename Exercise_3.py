#  REFERNCE: https://www.geeksforgeeks.org/linked-list-set-3-deleting-node/

class node:
    def __init__(self, value):
        self.data = value
        self.next = None

class LinkedList:
    def __init__(self):
        self.head = None

    def traverse_ll(self):

        self.traverse = self.head

        # LL not empty
        if self.head == None:
            print("LL empty")
            return
        else:
            while self.traverse:
                print(self.traverse.data)
                self.traverse = self.traverse.next

    def find(self, value):

        # ? what if instance value is defined outside init.
        self.find = self.head

        while(self.find):
            if self.find.data == value:
                return value
            else:
                self.find = self.find.next

        return None

    def remove(self, value):

     temp = self.head

        if (temp is not None):
            if (temp.data == key):
                self.head = temp.next
                temp = None
                return


        while(temp is not None):
            if temp.data == key:
                break
            prev = temp
            temp = temp.next


        if(temp == None):
            return


        prev.next = temp.next

        temp = None

ll = LinkedList()

node1 = node(1)
node2 = node(2)
node3 = node(3)

ll.head = node1
node1.next = node2
node2.next = node3

ll.traverse_ll()
print(ll.find(2))
