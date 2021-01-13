class ListNode:
    """
    A node in a singly-linked list.
    """
    def __init__(self, data=None, next=None):
        self.data = data
        self.next = None
    
class SinglyLinkedList:
    def __init__(self):
        """
        Create a new singly-linked list.
        Takes O(1) time.
        """
        self.head = None

    def append(self, data):
        """
        Insert a new element at the end of the list.
        Takes O(n) time.
        """
        if self.head==None:
            self.head=ListNode(data)
        else:
            temp=self.head
            while temp.next!=None:
                temp=temp.next
            temp.next=ListNode(data)
        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        if self.head==None:
            print("Empty singly-linked list")
        else:
            temp=self.head
            while temp !=None:
                if temp.data==key:
                    return key
                temp=temp.next
        return None
        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        if self.head==None:
            print("Empty singly-linked list")
        else:
            if self.head.data==key:
                self.head=self.head.next
                return True
            else:
                temp=self.head.next
                pre=self.head
                while temp!=None:
                    if temp.data==key:
                        pre.next=temp.next
                        return True
                    pre=temp
                    temp=temp.next
        return False

    def show(self):
        """
        Display SinglyLinkedlist
        """
        if self.head==None:
            print("Empty singly-linked list")
        else:
            temp=self.head
            while temp !=None:
                print(temp.data)
                temp=temp.next

a = SinglyLinkedList()
while True:
    print('append <value>')
    print('find <value>')
    print('remove <value>')
    print('Show')

    do = input('What would you like to do? ').split()
 

    operation = do[0].strip().lower()
    if operation == 'append':
        a.append(int(do[1]))
    elif operation == 'find':
        result = a.find(int(do[1]))
        if result is None:
            print('Key not found')
        else:
            print('Key found & key is: ', int(result))
    elif operation == 'remove':
        result = a.remove(int(do[1]))
        if result is False:
            print('key not found. Hence not removed')
        else:
            print('Key Removed')
    elif operation == 'show':
        a.show()
    elif operation == 'quit':
        break
