class ListNode:
    def __init__(self, data=None, next=None):
        self.data = data
        self.next = None
    
class SinglyLinkedList:
    def __init__(self):
        self.head = None

    def append(self, data):
        """
        Insert a new element at the end of the list.
        Takes O(n) time.
        """
        if self.head == None:
           self.head = ListNode(data)
        else:
            temp = self.head
            while temp.next is not None:
                temp = temp.next
            temp.next = ListNode(data)    
        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        if self.head == None:
            return
        else:
            temp = self.head
            while temp != None:
                if temp.data == key:
                    return key
                else:
                    temp = temp.next   
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        if self.head == None:
            return
        else:
            if self.head.next is None:
                if self.head.data == key:
                    self.head = None
                    print(key,'is removed')      
            else:    
                temp = self.head
                prev = self.head
                while temp != None:
                    if temp.data == key:
                        if prev == self.head:
                            self.head = temp.next
                        else:
                            prev = temp.next
                        print(key,'is removed')
                        return
                    else:
                        prev = temp
                        temp = temp.next
                        

mySingly = SinglyLinkedList()
while True:
    #Give input as string if getting an EOF error. Give input like "push 10" or "pop"
    print('append <> value')
    print('find <> value')
    print('remove <> value')
    print('quit')
    do = input("What would you like to do?").split()
    #Give input as string if getting an EOF error. Give input like "push 10" or "pop"
    operation = do[0].strip().lower()
    if operation == 'append':
        mySingly.append(int(do[1]))
    elif operation == 'find':
        print(mySingly.find(int(do[1])))
    elif operation == 'quit':
        break
    elif operation == 'remove':
        mySingly.remove(int(do[1]))
 