class ListNode:
    """
    A node in a singly-linked list.
    """
    def __init__(self, data=None, next=None):
        self.data = data
        self.next = next

    # added a funciton to get the next node 
    def getNextNode(self):
        return self.next
  
    # added a function to set the nexct node to our current node
    def setNextNode(self, node):
        self.next = node
    
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
        create_new_node = ListNode(data)
        if(self.head):
            current_node = self.head
            while(current_node.next):
                current_node = current_node.next
            current_node.next = create_new_node
            # print("adding ", current_node.data)
        else:
            self.head = create_new_node

        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        current_node = self.head
        while current_node:
            if current_node.data == key:
                return key
            else:
                current_node = current_node.next
        return None
        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        previous_node = None
        current_node = self.head
        while current_node:
            if current_node.data == key:
                if previous_node:
                    previous_node.setNextNode(current_node.getNextNode())
                else:
                    self.head = current_node.getNextNode()
                print("deleted: ", key)
            
            previous_node = current_node
            current_node = current_node.next
        
        print("Could not find ", key)

    # adding a function to print our singly linkedlist
    def printSingly(self):
        current_node = self.head
        while current_node:
            print(current_node.data)
            current_node = current_node.getNextNode()


singly = SinglyLinkedList()
print("Inserting")
singly.append(5)
singly.append(50)
singly.append(555)

print("\nPrinting entire Singly")
singly.printSingly()

print("\nFinding element")
print(singly.find(25))
print(singly.find(50))


print("\nremoving element")
print(singly.remove(50))


print("\nPrinting the new Singly")
singly.printSingly()