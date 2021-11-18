class Node():
    def __init__(self, data=None):
        self.data = data,
        self.next = None


class SinglyLinkedList():
    def __init__(self):
        self.head = None

    def append(self, data):
        if(self.head == None):
            self.head = Node(data)
            # print(self.head.data)
            self.head.data = data
            self.head.next = None
        else:
            temp = self.head
            # print("Checking the value assigned to temp",self.head.data)
            while temp.next != None:
                temp = temp.next
            newNode = Node(data)
            newNode.data = data
            temp.next = newNode
            temp.data = newNode.data

    def display(self):
        dispNode = self.head
        print("self.head is", self.head.data)
        while dispNode != None:
            print(dispNode.data)
            dispNode = dispNode.next

    def find(self, key):
        incr = 0
        resarr = []
        findNode = self.head
        while(key != findNode.data and findNode.next != None):
            # print("Key: ",key,"findNode.data is",findNode.data)
            findNode = findNode.next
            incr = incr+1
            if(findNode.data == key):
                resarr.append(findNode.data)
                resarr.append(incr)
                return resarr
        return None

    def Remove(self, key):
        arrres = []
        incr = 0
        nodeRemove = self.head
        while(key != nodeRemove.data):
            nodeRemove = nodeRemove.next
            incr += 1
            if(nodeRemove.data == key):
                arrres.append(nodeRemove.data)
                arrres.append(incr)
                return arrres
        return None


node1 = SinglyLinkedList()

node1.append(25)
node1.append(26)
node1.append(28)
node1.append(30)
node1.append(32)

node1.display()
print(node1.find(28))
print(node1.Remove(32))

