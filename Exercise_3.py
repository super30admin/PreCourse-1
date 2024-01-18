class ListNode:
    """
    A node in a singly-linked list.
    """
    def __init__(self, data=None, next=None):
        self.data = data
        self.next = next
    
class SinglyLinkedList:
    def __init__(self):
        """
        Create a new singly-linked list.
        Takes O(1) time.
        """
        self.head = ListNode()

    def append(self, data):
        """
        Insert a new element at the end of the list.
        Takes O(n) time.
        Space Complexity is O(n).
        """
        ptr = self.head
        while ptr.next!=None:
            ptr=ptr.next # Traverse to the end of the list
        newNode = ListNode(data) # Create the new Node
        ptr.next = newNode # append the new node to the end of the list
        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        Space Complexity is O(n).
        """
        if self.head.next == None: # check for empty list
            return None
        ptr = self.head
        while ptr.next!=None: #Traverse till the end of the list
            if ptr.data == key:
                return ptr.data # return element if found in the linkedlist
            else:
                ptr = ptr.next
        if ptr.data == key: # Check if the element at last node is present in the linkedlist
            return ptr.data 
        else:
            return None
        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        Space Complexity is O(n).
        """
        if self.head.next == None: #Check for empty list
            print("Empty List")
            return
        ptr = self.head
        while ptr.next.next != None: #Traverse all nodes except the last node
            if ptr.next.data == key: 
                break
            else:
                ptr = ptr.next
        if ptr.next.data == key:
            ptr2 = ptr.next 
            ptr.next = ptr.next.next # Replace the link to the target with that of target's next node
            print('Found ', ptr2.data,' deleting.')
            del ptr2 # delete the target node
        elif ptr.next.next ==None:
            print('Element Not Found')


linkedlist = SinglyLinkedList()
while True:
    print('append <value>')
    print('find <key>')
    print('remove <key>')
    do = input('What would you like to do? ').split()
    operation = do[0].strip().lower()
    if operation == 'append':
        linkedlist.append(int(do[1]))
    elif operation == 'find':
        op = linkedlist.find(int(do[1]))
        if op==None:
            print('Could not find element')
        else:
            print('Found, ',op)
    elif operation == 'remove':
        op = linkedlist.remove(int(do[1]))
    elif operation == 'quit':
        break
    


