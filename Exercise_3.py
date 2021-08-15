 """
   Singly linked list implementation
   Time Complexity initialization of listnode and singly linked list O(1)
   Inserting takes O(n) time since we have to traverse all array
   Finding takes O(n) time
   Removing takes O(n) time

   Space complexity:
   initialization O(1)
   appending O(n)
   finding O(1)
   removing O(1)
   printing O(1)

   Explanation is mentioned in every function below. 

"""

class ListNode:
    """
    A node in a singly-linked list.
    """
    def __init__(self, data=None, next=None):
        self.data=data
        self.next=next
    
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
        """
        newNode=ListNode(data)
        currentNode=self.head
        while currentNode.next!=None:
            currentNode=currentNode.next
        currentNode.next=newNode

    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        currentNode=self.head
        while currentNode.next!=None:
            currentNode=currentNode.next
            if currentNode.data==key:
                return (currentNode.data)
                break

        return ("No element found")

    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        currentNode=self.head
        while currentNode.next!=None:
            lastNode=currentNode
            currentNode=currentNode.next
            if currentNode.data==key:
                lastNode.next=currentNode.next
                return currentNode.data


    def printlinkedlist(self):
        """Printing the linkedlist"""
        currentNode=self.head
        while currentNode.next!=None:
            currentNode=currentNode.next
            print(currentNode.data)

ll = SinglyLinkedList()

while True:
    """
    Give input as a string here and chose
    if you would like to append, 
    find a certain key 
    or remove a certain key"""

    print('append <value>')
    print('find <value>')
    print('remove <value>')
    do = input('What would you like to do? ').split()
    """Give input like "append 10" or "find 10 or remove 10"""
    operation = do[0].strip().lower()
    if operation == 'append':
        ll.append(int(do[1]))

    elif operation=="print":
        ll.printlinkedlist()

    elif operation == 'remove':
        removed = ll.remove(int(do[1]))
        if removed is None:
            print('Stack is empty.')
        else:
            print('Removed value: ', int(removed))

    elif operation == 'find':
        print(ll.find(int(do[1])))

    elif operation == 'quit':
        break