class ListNode:
    """
    A node in a singly-linked list.
    """
    def __init__(self, data=None, next=None):
        self.data = data
        self.next = next    
    def getNext(self):
        return self.next
    def setNext(self, next):
        self.next = next
    def getData(self):
        return self.data
    def setData(self, data):
        self.data = data
class SinglyLinkedList:
    def __init__(self, root = None):
        self.root = root
        self.size = 0

    def getSize(self):
        return self.size

    def append(self, data):
        newNode = ListNode(data, self.root)
        self.root = newNode
        self.size += 1
        print(self.root.getData())
        return data

    def remove(self, data):
        currNode = self.root
        prevNode = None
        # 9 < 8 < 2 [curr] < 4 [prev] < 3 [root], data = 2
        # 9 < 8 [root], data = 8
        # 8 [root], data = 8
        while currNode:
            if currNode.getData() == data:
                if prevNode:
                    prevNode.setNext(currNode.getNext())
                else:
                    # reset the root
                    self.root = currNode.getNext()
                # remove the connection from the node
                currNode.setNext(None)
                self.size -= 1
                # fix pointers
                
                return True
            else:
                prevNode = currNode
                currNode = currNode.getNext()
        return False

    def find(self, data):
        currNode = self.root
        
        while currNode:
            if currNode.getData() == data:
                return data
            else:
                currNode = currNode.getNext()
        return None

    def show(self):
        list = ""
        
        currNode = self.root
        
        while currNode:
            list += str(currNode.getData()) + " "
            currNode = currNode.getNext()

        return list

linkedList = SinglyLinkedList()
while True:
    print('append <value>')
    print('find <key>')
    print('remove <key>')
    print('show')
    print('quit')
    do = input('What would you like to do? ').split()
    operation = do[0].strip().lower()
    if operation == 'append':
        data = linkedList.append(int(do[1]))
        print("Appended: ", data)
    elif operation == 'find':
        found = linkedList.find(int(do[1]))
        if found is None:
            print('List is empty.')
        else:
            print('Found value: ', int(found))
    elif operation == 'remove':
        removed = linkedList.remove(int(do[1]))
        print("Remaining: ", linkedList.getSize())
        print("Removed: ", removed)
    elif operation == 'show': 
        print(linkedList.show())
    elif operation == 'quit': 
        break
