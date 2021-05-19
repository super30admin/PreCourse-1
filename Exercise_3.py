class ListNode:
    def __init__(self, value=None, link=None):
        self.value=value
        self.link=None


class SinglyLinkedList:
    def __init__(self):
        self.start=None

    def append(self, data):
        temp=ListNode(data)
        if self.start ==None:
            self.start=temp
            return
        curr=self.start
        while curr.link!=None:
            curr=curr.link
        curr.link=temp

    def find(self,key):
        curr=self.start
        while curr!=None and curr.value!=key:
            curr=curr.link
        return curr

    def remove(self,key):
        curr=self.start
        prev=None
        while curr!=None and curr.value!=key:
            prev=curr
            curr=curr.link
        if prev== None:
            self.start=None
        elif curr!=None: #if key found, remove it
            prev.link=curr.link

    def printList(self):
        temp = self.start
        while (temp):
            print(temp.value)
            temp = temp.link
        return


#driver
LinkedList = SinglyLinkedList()
while True:
    print('append <value>')
    print('find <value>')
    print('remove <value>')
    print('print')
    do = input('What would you like to do? ').split()

    operation = do[0].strip().lower()
    if operation == 'append':
        LinkedList.append(int(do[1]))
    elif operation == 'find':
        foundValue = LinkedList.find(int(do[1]))
        if foundValue is None:
            print('Value not found in LinkedList.')
        else:
            print('FoundValue ', foundValue.value)
    elif operation == 'remove':
        LinkedList.remove(int(do[1]))

    elif operation == 'print':
        LinkedList.printList()