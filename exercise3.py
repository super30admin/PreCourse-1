class Node:
    def __init__(self,data):
        self.data = data
        self.next = None
class Linkedlist:
    def __init__(self):
        self.head = None
    # def printList(self):
    #     temp = self.head
    #     while(temp):
    #         print(temp.data)
    #         temp = temp.next
    def find(self,key):
        curr = self.head
        if self.head == None:
            print("linked list is empty")
        else:
             while curr != None:
                if curr.data == key:
                    print("element found matching with key")
                    return curr.data
                curr = curr.next
        # else:
            # print("End of linked list, there is no element with matching key")


    def append(self,data):
        newnode = Node(data)
        if self.head == None:
            self.head = newnode
            print("new node appended")
            return self.head.data

        else:
            n = self.head
            while n.next != None:
                n=n.next
            n.next = newnode
            print("new node appended after head")
            return newnode.data

    # def find(self, key):
    #     Search for the first element with `data` matching
    #     `key`. Return the element or `None` if not found.
    #     Takes O(n) time.
    #
    #
    def remove(self, key):
        curr = self.head
        prev = None
        while curr != None:
            if curr.data == key:
                    prev.next = curr.next
                    print("element removed")
            # break
            prev = curr
            curr = curr.next

    #     Remove the first occurrence of `key` in the list.
    #     Takes O(n) time.
    #                 #else:
    #                     #data1 = Node(data)
    #                     #data1.next = data1
    #                 #data1.next =self.head

if __name__ == '__main__':
    A = Linkedlist()
    A.find(1)
    A.append(10)
    A.append(2)
    A.find(10)
    A.remove(2)
# A.remove(2)
    # llist = Linkedlist()
    # llist.head = Node(1)
    # second = Node('Niha')
    # third = Node(3)
    # llist.head.next = second
    # second.next = third
    # llist.printList()
